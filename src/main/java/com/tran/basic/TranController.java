package com.tran.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tran.basic.svc.SvcBuyInface;

@Controller
public class TranController {
	@Autowired
	SvcBuyInface svcBuyInface;

//	메인페이지
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "스프링부트	트랜잭션의	이해!";
	}

//입력	페이지
	@RequestMapping("/input")
	public String input() {
		return "input";
	}

//트랜잭션	처리
	@RequestMapping("/tranProc")
	public String tranProcess(@RequestParam("consumerId") String consumerId, @RequestParam("amount") String amount,
			@RequestParam("error") String error, Model model) {
		int nResult = svcBuyInface.buy(consumerId, Integer.parseInt(amount), error);
		model.addAttribute("consumerId", consumerId);
		model.addAttribute("amount", amount);
		if (nResult == 1) {
			return "end";
		} else {
			return "error";
		}
	}
}
