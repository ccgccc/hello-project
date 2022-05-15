package com.ccg.hello_javaweb;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("---- Entering Filter...");
		System.out.println("Request URI: " + ((HttpServletRequest) request).getRequestURI());
		System.out.println("Context Path: " + ((HttpServletRequest) request).getContextPath());
		System.out.println("Servlet Path: " + ((HttpServletRequest) request).getServletPath());
		System.out.println("Path Info: " + ((HttpServletRequest) request).getPathInfo());
		chain.doFilter(request, response);
	}
}
