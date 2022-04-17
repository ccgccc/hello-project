package com.ccg.myejb.stateful;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

@Stateful
@Remote
public class StatefulBeanRemote implements StatefulInf {

	private int count;

	@Override
	public int count() {
		return ++count;
	}
}
