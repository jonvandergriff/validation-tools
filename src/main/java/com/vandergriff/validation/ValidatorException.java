package com.vandergriff.validation;

public class ValidatorException extends Exception {

	private static final long serialVersionUID = 3449424149130023729L;

	/**
	 * 
	 */
	public ValidatorException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ValidatorException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ValidatorException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public ValidatorException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ValidatorException(Throwable cause) {
		super(cause);
	}

}
