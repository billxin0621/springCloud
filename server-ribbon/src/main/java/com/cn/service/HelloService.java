package com.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	
	@Autowired
    RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
    public String hello(String name) {
        return restTemplate.getForObject("http://server-client/hi?name="+name,String.class);
    }
	
	//断路器调用的方法
	public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
