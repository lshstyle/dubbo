package com.provider.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderOne {
	public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务器1启动...");
        System.in.read();
    }
}
