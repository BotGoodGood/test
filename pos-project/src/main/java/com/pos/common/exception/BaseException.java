package com.pos.common.exception;

import javax.ejb.ApplicationException;

/**
 * Created by SampleHsu on 4/4/16.
 */
@ApplicationException(rollback = true)
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = -7326476747928152924L;

	public BaseException(String message) {
		super(message);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

}
