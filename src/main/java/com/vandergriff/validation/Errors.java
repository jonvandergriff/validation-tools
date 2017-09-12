package com.vandergriff.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 
 * @author Jon Vandergriff
 *
 */
@ToString
@EqualsAndHashCode
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
		synchronized (errors) {
			errors.add(e);
		}
	}

	/**
	 * 
	 * @param errors
	 */
	public void addAll(Collection<ValidationError> errors) {
		errors.addAll(errors);
	}

	/**
	 * 
	 * @return
	 */
	public Collection<ValidationError> getHardErrors() {
		synchronized (errors) {
			return errors.stream()
					.filter(e -> Severity.HARD.equals(e.getSeverity()))
					.collect(Collectors.toList());
		}
	}

	/**
	 * 
	 * @return
	 */
	public Collection<ValidationError> getErrors() {
		return Collections.unmodifiableCollection(errors);
	}

}
