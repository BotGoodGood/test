package com.pos.api;

import com.pos.common.model.OrderMain;

import java.io.Serializable;
import java.util.List;


public interface OrderRemoteService extends Serializable {

	public  List<OrderMain> queryOrderMainList();
}
