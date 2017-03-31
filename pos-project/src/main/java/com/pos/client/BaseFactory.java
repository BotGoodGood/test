package com.pos.client;

import com.pos.common.exception.BaseException;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

/**
 * Created by SampleHsu on 4/4/16.
 */
public class BaseFactory {

	private static Context initialContext;
	private static final String PKG_INTERFACES = "org.jboss.ejb.client.naming";
	private static String MODULE_NAME = "";

	static {
		try {
			if (initialContext == null) {
				Properties properties = new Properties();
				properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);

				initialContext = new InitialContext(properties);
			}
		} catch (Exception e) {
			throw new BaseException("ejb init properties error");
		}
	}

	protected BaseFactory(String moduleName) {
		MODULE_NAME = moduleName;
	}

	private String getJndi(Class<?> remoteService) {

		String implementBean = remoteService.getSimpleName().replace("RemoteService", "ServiceBean");

		return "ejb:/" + MODULE_NAME + "//" + implementBean + "!" + remoteService.getName();
	}

	protected <T> T getEjbService(Class<T> remoteService) {

		try {

			System.out.println(getJndi(remoteService));
			return remoteService.cast(initialContext.lookup(getJndi(remoteService)));
		} catch (Exception e) {
			throw new BaseException("get ejb service error");
		}
	}
}
