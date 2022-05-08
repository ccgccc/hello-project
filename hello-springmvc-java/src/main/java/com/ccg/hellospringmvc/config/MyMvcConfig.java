package com.ccg.hellospringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// 配置文件的支持
@Configuration
// 开启SpringMVC
@EnableWebMvc
// 配置自定义扫描包,将base-package修改为你的包名
@ComponentScan("com.ccg.hellospringmvc")
public class MyMvcConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		// 配置视图解析器:把handler方法返回值解析为实际的物理视图，如返回值为sucess，物理视图为prefix+sucess+.jsp
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
}