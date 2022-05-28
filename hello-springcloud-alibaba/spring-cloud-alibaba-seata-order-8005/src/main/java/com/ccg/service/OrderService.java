package com.ccg.service;


import com.ccg.entity.CommonResult;
import com.ccg.entity.Order;

public interface OrderService {
	/**
	 * 创建订单数据
	 *
	 * @param order
	 */
	CommonResult create(Order order);
}
