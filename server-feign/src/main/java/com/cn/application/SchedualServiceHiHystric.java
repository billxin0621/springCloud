package com.cn.application;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements TestInterface {

	@Override
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "sorry "+name;
	}

}
