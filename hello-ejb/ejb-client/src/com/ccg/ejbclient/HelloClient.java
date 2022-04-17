package com.ccg.ejbclient;

import com.ccg.myejb.HelloEjbRemote;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class HelloClient {
	public static void main(String[] args) throws NamingException {
		Properties pro = new Properties();
		pro.put("jboss.naming.client.ejb.context", true);
		pro.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		pro.put(Context.PROVIDER_URL, "remote://127.0.0.1:4447");
		// username
		pro.put(Context.SECURITY_PRINCIPAL, "ccg");
		// password
		pro.put(Context.SECURITY_CREDENTIALS, "123");

		Context context = new InitialContext(pro);
		HelloEjbRemote h = (HelloEjbRemote) context.lookup("myejb-ejb/HelloEjbBean!com.ccg.myejb.HelloEjbRemote");
		System.out.println(h.sayHello("ccg"));
	}
}
