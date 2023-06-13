package com.tran.basic.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tran.basic.dao.Tran1Dao;
import com.tran.basic.dao.Tran2Dao;

@Service
public class SvcBuyImplet implements SvcBuyInface {
	@Autowired
	Tran1Dao tran1Dao;
	@Autowired
	Tran2Dao tran2Dao;

	@Override
	public int buy(String consumerId, int amount, String error) {
		try {
			tran1Dao.pay(consumerId, amount);
//	테스트용	에러	발생	코드
			if (error.equals("1")) {
				int n = 3 / 0;
			}
			tran2Dao.pay(consumerId, amount);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
}
