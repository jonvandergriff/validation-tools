package com.vandergriff.validation;

public interface ValidationError {
	
	Severity getSeverity();
	
	String getMessage();

}
