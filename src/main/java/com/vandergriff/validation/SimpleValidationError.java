package com.vandergriff.validation;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@EqualsAndHashCode
@Getter
@ToString
public class SimpleValidationError implements ValidationError {

	private String message;
	private Severity severity;

}
