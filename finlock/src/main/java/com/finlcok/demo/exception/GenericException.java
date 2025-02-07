package com.finlcok.demo.exception;

import org.springframework.http.HttpStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String fieldName;
	private final HttpStatus httpStatusCode;

	public GenericException(final String fieldName, final HttpStatus httpStatusCode, String message) {
		super(message);
		this.fieldName = fieldName;
		this.httpStatusCode = httpStatusCode;

	}

}
