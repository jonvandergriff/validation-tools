package com.vandergriff.validation;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class ValidationError {

	private String message;
	private Object entity;
	private Severity severity;

}
