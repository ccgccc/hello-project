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

		/**
		 * 设置 pro2.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		 * 可使用 ejb:/ 访问，也可不用
		 */
		Properties pro2 = new Properties();
		pro2.put("jboss.naming.client.ejb.context", true);
		pro2.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		pro2.put(Context.PROVIDER_URL, "remote://127.0.0.1:4447");
		// username
		pro2.put(Context.SECURITY_PRINCIPAL, "ccg");
		// password
		pro2.put(Context.SECURITY_CREDENTIALS, "123");
		pro2.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

		Context context2 = new InitialContext(pro2);
		HelloEjbRemote h2 = (HelloEjbRemote) context2.lookup("ejb:/myejb-ejb/HelloEjbBean!com.ccg.myejb.HelloEjbRemote");
		System.out.println(h2.sayHello("ccg2"));
	}
}
