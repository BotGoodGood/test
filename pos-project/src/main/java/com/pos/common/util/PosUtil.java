package com.pos.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Title: com.ch.util.CfUtil<br>
 * Description: FIXME CfUtil Description
 *
 * @author: Sample.Hsu
 * @version: 1.0
 */
public class PosUtil {

	public static boolean isValidCustomerName(String str) {

		return StringUtils.isNotBlank(str) && str.matches("^[a-zA-Z0-9]{4,16}$");
	}

	public static boolean isValidPassword(String str) {

		return StringUtils.isNotBlank(str) && str.matches("^(?=.*[a-zA-Z]+)(?=.*[0-9]+)[a-zA-Z0-9]{8,16}$");
	}

}
