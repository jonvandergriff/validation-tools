package com.vandergriff.validation;

public interface Validator {

	public Errors doValidate(Object item, Errors e);

}
