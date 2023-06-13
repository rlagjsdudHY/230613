package com.tran.basic.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tran2Dao {
	public void pay(String consumerId, int amount);
}
