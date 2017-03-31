package com.pos.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pos.common.dto.JsonResponse;
import com.pos.common.dto.LineResp;

import javax.faces.bean.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/line")
@Produces({MediaType.APPLICATION_JSON})
@RequestScoped
public class LineResource {

	private static ObjectMapper objectMapper = new ObjectMapper();


	@GET
	public Response receive(LineResp lineResp) throws Exception{

		System.out.println(objectMapper.writeValueAsString(lineResp));

		return Response.status(200).entity(new JsonResponse("OK")).build();
	}

}
