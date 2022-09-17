package com.org.idv.MyJBank.db.dao;

import com.org.idv.MyJBank.db.vo.UserLoginVO;

public interface UserLoginDAO {
	UserLoginVO login(String name,String password);

}
