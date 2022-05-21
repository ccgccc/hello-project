package com.ccg.service;

import com.ccg.entity.Dept;

import java.util.List;

public interface DeptService {
	Dept get(Integer deptNo);

	List<Dept> selectAll();
}