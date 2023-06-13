package com.tran.basic.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tran1Dao {
	public void pay(String consumerId, int amount);
}