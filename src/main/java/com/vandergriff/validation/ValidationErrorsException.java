package com.vandergriff.validation;

public class ValidationErrorsException extends Exception {

	private static final long serialVersionUID = -5029898002174770879L;
	private Errors errors;

	/**
	 * 
	 */
	public ValidationErrorsException() {
		super();
	}

	/**
	 * @param errors
	 */
	public ValidationErrorsException(Errors errors) {
		super("The errors are [ " + errors.toString() + " ]");
		this.errors = errors;
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ValidationErrorsException(String message, Throwable cause, Errors errors) {
		super(message, cause);
		this.errors = errors;
	}

	/**
	 * @param message
	 */
	public ValidationErrorsException(String message, Errors errors) {
		super(message);
		this.errors = errors;
	}

	/**
	 * @param cause
	 */
	public ValidationErrorsException(Throwable cause, Errors errors) {
		super(cause);
		this.errors = errors;
	}

	/**
	 * @return the errors
	 */
	public Errors getErrors() {
		return errors;
	}

}
