package com.pos.controller;

import com.pos.api.OrderService;
import com.pos.common.dto.JsonResponse;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/order")
@Produces({MediaType.APPLICATION_JSON})
@RequestScoped
public class OrderResource {


	@Inject
	private OrderService orderService;

	@GET
	public Response queryOrderMainList() {

		return Response.status(200).entity(new JsonResponse(orderService.queryOrderMainList())).build();
	}

}
