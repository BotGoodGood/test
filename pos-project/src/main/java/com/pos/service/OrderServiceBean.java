package com.pos.service;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.pos.api.OrderRemoteService;
import com.pos.api.OrderService;
import com.pos.common.model.OrderMain;
import com.pos.persistence.OrderMainDao;

@Local(OrderService.class)
@Remote(OrderRemoteService.class)
@Stateless
public class OrderServiceBean implements OrderService {

	private static final long serialVersionUID = 6571577788324035551L;

	@Inject
	private OrderMainDao orderMainDao;

	@Override
	public List<OrderMain> queryOrderMainList() {
		return orderMainDao.findAll();
	}
}
