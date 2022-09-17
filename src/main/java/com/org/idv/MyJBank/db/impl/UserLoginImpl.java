package com.org.idv.MyJBank.db.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.org.idv.MyJBank.db.RDBConnection;
import com.org.idv.MyJBank.db.dao.UserLoginDAO;
import com.org.idv.MyJBank.db.vo.UserLoginVO;

public class UserLoginImpl implements UserLoginDAO {

	@Override
	public UserLoginVO login(String name, String password) {
		String sqlStr = "select * from UserLogin where UserName=? and UserPass=?";
		Connection conn = RDBConnection.getConnect("APDATA");
		System.out.println("connection: "+conn);
		try {
			PreparedStatement preparedStatement =conn.prepareStatement(sqlStr);
//			System.out.println("preparedStatement: "+preparedStatement);
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,password);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				UserLoginVO vo = new UserLoginVO();
				vo.setUserName(resultSet.getString("UserName"));
				vo.setUserPass(resultSet.getString("UserPass"));
				
				return vo;
			}
			
		} catch (SQLException throwable) {
			throwable.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException throwable) {
				throwable.printStackTrace();
			}
		}
		return null;
	}

}
