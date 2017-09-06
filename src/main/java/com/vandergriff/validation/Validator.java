package com.vandergriff.validation;

public interface Validator<T> {

	public Errors doValidate(T item, Errors e);

}
