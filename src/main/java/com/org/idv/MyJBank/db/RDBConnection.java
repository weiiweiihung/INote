package com.org.idv.MyJBank.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import java.util.logging.Logger;

import com.org.idv.MyJBank.a.MSGException;

/**
 * @author Jenny
 *
 * @Description 
 */

public class RDBConnection {
	
	private static String driver, url, user, dbPwd;
	static {
		//動態取得 
		driver = System.getProperty("driver", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		url = System.getProperty("url", "jdbc:sqlserver://127.0.0.1:1433");
		user = System.getProperty("user", "sa");
		dbPwd = System.getProperty("pwd", "root");
	}

	static Connection getConnection() throws MSGException {
		try {
			Class.forName(driver); // 1.載入JDBC Driver
			try {
				Connection connection = DriverManager.getConnection(url, user, dbPwd);// 2.建立連線
				return connection;
			} catch (SQLException e) {
				throw new MSGException("建立資料庫連線失敗", e);
			}
		} catch (ClassNotFoundException e) {
			throw new MSGException("載入JDBC Driver失敗");
		}
	}
    public static Connection getConnect(String dbName) {

        url = "jdbc:sqlserver://127.0.0.1:1433;database="+dbName ;

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, dbPwd);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
    
	public static void main(String[] args) {

		try (Connection c = getConnection();) {
			System.out.println(c.getMetaData().getUserName());
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (MSGException e) {
			Logger.getLogger("RDBConnection.main").log(Level.SEVERE, e.getMessage());
		} catch (Exception e) {
			Logger.getLogger("RDBConnection.main").log(Level.SEVERE, "發生非預期錯誤", e.getMessage());
		}
	}
}