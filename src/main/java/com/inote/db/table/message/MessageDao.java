package com.inote.db.table.message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.inote.db.FactoryDao;
import com.inote.db.RDBConnection;

public class MessageDao implements FactoryDao {

	public MessageModel selectKey(String code) {
		String sqlStr = "select * from Message where MSGCode=? ";

		PreparedStatement preparedStatement = null;
		Connection conn = null;
		try {
			conn = RDBConnection.getConnect("APDATA");
			preparedStatement = conn.prepareStatement(sqlStr);

			preparedStatement.setString(1,code);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				MessageModel vo = new MessageModel();
				vo.setMSGCode(resultSet.getString("MSGCode"));
				vo.setMSGCh(resultSet.getString("MSGCh"));
				vo.setMSGGrade(resultSet.getString("MSGGrade"));
				vo.setMSGRemark(resultSet.getString("MSGRemark"));

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

}
