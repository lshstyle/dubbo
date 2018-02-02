package com.provider.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.api.service.DemoService;

public class DemoServiceImplTwo implements DemoService{
	@Override
	public List<String> getPermissions(String sender) {
		// TODO Auto-generated method stub
		List<String> demo = new ArrayList<String>();
		SimpleDateFormat format = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		demo.add(format.format(new Date()) 
				+ " 我是服务器2,很高心为大家服务\r\n" + sender);
		
		return demo;
	}

}
