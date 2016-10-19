package com.qijiabin.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qijiabin.entity.User;

/**
 * ========================================================
 * 日 期：2016年10月19日 上午10:18:54
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
@Controller
public class HelloController {

	// 从 application.properties 中读取配置，如取不到默认值为Hello Tom
	@Value("${application.hello:Hello Tom}")
	private String hello;

	@RequestMapping("/helloJsp")
	public String helloJsp(Map<String, Object> map) {
		System.out.println("HelloController.helloJsp().hello=" + hello);
		map.put("hello", hello);
		return "helloJsp";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setId(1);
		user.setAge(25);
		user.setName("jackson");
		user.setDate(new Date());
		return user;
	}

}
