package com.pos;

import com.pos.common.util.PosUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.validator.GenericValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Title: com.ch.Test<br>
 * Description: FIXME Test Description
 *
 * @author: Sample.Hsu
 * @version: 1.0
 */
public class Test {

	private static Logger logger = LoggerFactory.getLogger(Test.class);

	public static void main(String[] args) {
		logger.info("test {}", 1);

		System.out.println(GenericValidator.isEmail("123@gmial.com"));
		System.out.println(GenericValidator.isEmail("123qwqwq_#@gmialcom"));

		// System.out.println(Character.isLetterOrDigit());
		System.out.println(StringUtils.isAlphanumeric("aa_bbcc123"));
		System.out.println(StringUtils.isAlphanumeric("aa我qqqbbcc123"));
		System.out.println(PosUtil.isValidCustomerName("aa我qqqbbcc123"));
	}
}
