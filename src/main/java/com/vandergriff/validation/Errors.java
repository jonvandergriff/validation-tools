package com.vandergriff.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Errors {

	private Collection<ValidationError> errors;

	/**
	 * 
	 */
	public Errors() {
		errors = new ArrayList<>();
	}

	/**
	 * 
	 * @param e
	 */
	public void add(ValidationError e) {
		synchronized(errors){
			errors.add(e);
		}
	}

	/**
	 * 
	 * @return
	 */
	public Collection<ValidationError> getHardErrors() {
		return errors.stream().filter(e -> Severity.HARD.equals(e.getSeverity()))
				.collect(Collectors.toList());
	}

}
