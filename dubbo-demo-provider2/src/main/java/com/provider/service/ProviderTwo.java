package com.provider.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTwo {
	public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务器2启动...");
        System.in.read();
    }
}
