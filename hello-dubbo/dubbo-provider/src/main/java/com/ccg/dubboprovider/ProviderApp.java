package com.ccg.dubboprovider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xml方式启动
 *
 */
public class ProviderApp
{
	public static void main( String[] args ) throws IOException {
		//加载xml配置文件启动
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
		context.start();
		System.out.println("Dubbo Provider Started...");
		System.in.read(); // 按任意键退出
	}
}