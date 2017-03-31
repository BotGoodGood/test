package com.pos.filter;

import com.pos.common.dto.JsonResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Created by SampleHsu on 4/4/16.
 */
@WebFilter(filterName = "SessionFilter", urlPatterns = "/resource/*")
public class SessionFilter implements Filter {

	private static ObjectMapper objectMapper = new ObjectMapper();
	private static final String JSON_CONTENT_TYPE = "application/json";
	private static final String ENCODING = "UTF-8";
	private static Logger logger = LoggerFactory.getLogger(SessionFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {

		try {
			logger.info("in filter {}", 1);
			chain.doFilter(request, response);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			JsonResponse jsonResponse = new JsonResponse();
			jsonResponse.setErrorMessage(e.getMessage());

			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.setCharacterEncoding(ENCODING);
			httpResponse.setContentType(JSON_CONTENT_TYPE);
			httpResponse.setStatus(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			httpResponse.getWriter().write(objectMapper.writeValueAsString(jsonResponse));
			httpResponse.flushBuffer();
		}
	}

	@Override
	public void destroy() {

	}
}
