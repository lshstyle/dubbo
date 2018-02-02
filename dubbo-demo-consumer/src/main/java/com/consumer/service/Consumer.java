package com.consumer.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.api.service.DemoService;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println(demoService.getPermissions("消费者开始消费......"));
	}

}
