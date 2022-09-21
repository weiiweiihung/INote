package com.inote.db.table.userLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.inote.db.FactoryDao;
import com.inote.db.RDBConnection;

public class UserLoginDao implements FactoryDao {

	public UserLoginModel login(String name, String password) {
		String sqlStr = "select * from UserLogin where UserName=? and UserPass=?";
		PreparedStatement preparedStatement = null;
		Connection conn = null;
		try {
			conn = RDBConnection.getConnect("APDATA");
			preparedStatement = conn.prepareStatement(sqlStr);
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,password);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				UserLoginModel vo = new UserLoginModel();
				vo.setUserName(resultSet.getString("UserName"));
				vo.setUserPass(resultSet.getString("UserPass"));
				
				return vo;
			}
			preparedStatement.clearParameters();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				preparedStatement.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public int addUser(UserLoginModel model) {
		String sqlStr = "INSERT INTO UserLogin (UserName, UserPass, CustName, CustCell, CustBirth)"
				+ "VALUES (?, ?, ?, ?, ?);";
		int code = 0;
		
		PreparedStatement preparedStatement = null;
		Connection conn = null;
		try {
			conn = RDBConnection.getConnect("APDATA");
			preparedStatement = conn.prepareStatement(sqlStr);
			preparedStatement.setString(1,model.getUserName());
			preparedStatement.setString(2,model.getUserPass());
			preparedStatement.setString(3,model.getCustName());
			preparedStatement.setString(4,model.getCustCell());
			preparedStatement.setString(5,model.getCustBirth());
			
			code = preparedStatement.executeUpdate();
			preparedStatement.clearParameters();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return code;
	}
}
