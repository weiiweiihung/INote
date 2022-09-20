package com.inote.db;

import java.sql.Connection;

public interface FactoryDao {
	Connection conn = RDBConnection.getConnect("APDATA");
	public String sqlStr = "";
}
