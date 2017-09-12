package com.vandergriff.validation;

public interface Validator<T> {

	/**
	 * Returns a non-null {@link Errors} object with validation errors.
	 * 
	 * @param item
	 *            the item to validate
	 * @param e
	 *            the {@link Errors}
	 * @return {@link Errors} with validation errors.
	 */
	public Errors doValidate(T item, Errors e);

}
