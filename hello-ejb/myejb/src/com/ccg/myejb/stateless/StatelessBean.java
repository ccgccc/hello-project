package com.ccg.myejb.stateless;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class StatelessBean implements StatelessInf {

	private int count;

	@Override
	public int count() {
		return ++count;
	}
}
