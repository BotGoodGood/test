package com.pos.client;

import com.pos.api.OrderRemoteService;

import javax.enterprise.inject.Produces;

/**
 * Title: com.ch.client.ChFactory<br>
 * Description: FIXME ChFactory Description
 *
 * @author: Sample.Hsu
 * @version: 1.0
 */
public class PosFactory extends BaseFactory {

	private static final PosFactory DJS_FACTORY = new PosFactory();

	public PosFactory() {
		super("pos");
	}

	public static PosFactory getInstance() {
		return DJS_FACTORY;
	}

	@Produces
	public OrderRemoteService getOrderService() {

		return getEjbService(OrderRemoteService.class);
	}
}
