package com.qijiabin.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * ========================================================
 * 日 期：2016年10月19日 上午10:45:10
 * 版 本：1.0.0
 * 类说明：
 * TODO
 * ========================================================
 * 修订日期     修订人    描述
 */
public class User {

	private int id;
	
	@JSONField(serialize=false)
	private int age;
	
	private String name;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")    
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
