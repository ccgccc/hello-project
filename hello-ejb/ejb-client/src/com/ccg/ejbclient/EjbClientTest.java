package com.ccg.ejbclient;

import com.ccg.myejb.stateful.StatefulInf;
import com.ccg.myejb.stateless.StatelessInf;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class EjbClientTest {
	public static void main(String[] args) throws NamingException {
		Properties pro = new Properties();
		pro.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		pro.put(Context.PROVIDER_URL, "remote://127.0.0.1:4447");
		pro.put("jboss.naming.client.ejb.context", true);
		// username
		pro.put(Context.SECURITY_PRINCIPAL, "ccg");
		// password
		pro.put(Context.SECURITY_CREDENTIALS, "123");

		Context context = new InitialContext(pro);
		System.out.println("Stateful Bean Test:");
		StatefulInf sf1 = (StatefulInf) context.lookup("myejb-ejb/StatefulBean!com.ccg.myejb.stateful.StatefulInf");
		System.out.println("StatefulInf1.count: " + sf1.count());
		System.out.println("StatefulInf1.count: " + sf1.count());
		System.out.println("StatefulInf1.count: " + sf1.count());

		StatefulInf sf2 = (StatefulInf) context.lookup("myejb-ejb/StatefulBean!com.ccg.myejb.stateful.StatefulInf");
		System.out.println("StatefulInf2.count: " + sf2.count());
		System.out.println("StatefulInf2.count: " + sf2.count());
		System.out.println("StatefulInf2.count: " + sf2.count());

		System.out.println("\nStateless Bean Test:");
		StatelessInf sl1 = (StatelessInf) context.lookup("myejb-ejb/StatelessBean!com.ccg.myejb.stateless.StatelessInf");
		System.out.println("StatefulInf1.count: " + sl1.count());
		System.out.println("StatefulInf1.count: " + sl1.count());
		System.out.println("StatefulInf1.count: " + sl1.count());

		StatelessInf sl2 = (StatelessInf) context.lookup("myejb-ejb/StatelessBean!com.ccg.myejb.stateless.StatelessInf");
		System.out.println("StatefulInf2.count: " + sl2.count());
		System.out.println("StatefulInf2.count: " + sl2.count());
		System.out.println("StatefulInf2.count: " + sl2.count());
	}
}
