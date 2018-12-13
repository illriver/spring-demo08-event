package com.illriver.spring_demo08_event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * @author Pactera
 *
 */

public class DemoEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;
	private String msg;

	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
		// TODO Auto-generated constructor stub
	}
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg){
		this.msg = msg;
	}

}
