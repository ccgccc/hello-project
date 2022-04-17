package com.ccg.myejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Remote注解必须写，这是暴露给Client的注解
 */
@Stateless
@Remote
public class HelloEjbBean implements HelloEjbRemote{

	@Override
	public String sayHello(String name) {
		return "Hello EJB! This is " + name + "!";
	}

}
