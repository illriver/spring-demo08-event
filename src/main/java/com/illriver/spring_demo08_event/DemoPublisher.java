package com.illriver.spring_demo08_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 * @author Pactera
 *
 */
@Component
public class DemoPublisher {
	
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}

}
