package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Data;

// 구매, 판매 로직의 핵심 기능이라고 가정
@Component
public class Car {
	//구매하는 로직 작성
	public void buy() {
		System.out.println("자동차 구매");
	}
	public void buyMoney(int money) {
		System.out.println("자동차 구매 금액 : " + money);
	}
	public String buyReturn() {
		return "구매성공";
	}
	//판매하는 로직 작성
	public void sellCar(int money) throws Exception {
		if(money<=1000) {
			throw new Exception("너무 저렴함");
		}
	}
}
