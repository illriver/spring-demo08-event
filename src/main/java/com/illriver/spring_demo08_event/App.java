package com.illriver.spring_demo08_event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 主体类
 *
 */
public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        
        demoPublisher.publish("Hello Application Event!");
        context.close();
    }
}
