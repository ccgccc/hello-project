package com.ccg.dubboconsumer;

import com.ccg.dubboprovider.service.ProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * xml的方式调用
 */
public class ConsumerApp {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("Dubbo Consumer Started...");
		ProviderService providerService = (ProviderService) context.getBean("providerService");
		String str = providerService.SayHello("hello");
		System.out.println(str);
		System.in.read();
	}
}