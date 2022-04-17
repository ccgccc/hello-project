package com.ccg.myejb;

import javax.ejb.Remote;

/**
 * Remote注解必须写，这是暴露给Client的注解
 * 可以写在接口，也可以写在实现类
 */
@Remote
public interface HelloEjbRemote {

	String sayHello(String name);
}
