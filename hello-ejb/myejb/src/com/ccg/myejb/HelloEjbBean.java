package com.ccg.myejb;

import javax.ejb.Stateless;

@Stateless
public class HelloEjbBean implements HelloEjbRemote {

	@Override
	public String sayHello(String name) {
		return "Hello EJB! This is " + name + "!";
	}

}
