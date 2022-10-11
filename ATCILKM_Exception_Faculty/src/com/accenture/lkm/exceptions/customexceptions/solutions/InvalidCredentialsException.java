package com.accenture.lkm.exceptions.customexceptions.solutions;

public class InvalidCredentialsException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidCredentialsException() {
		super();
	}

	public InvalidCredentialsException(String message) {
		super(message);
	}

}
