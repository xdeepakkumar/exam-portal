package com.exam.helper;

public class UserNotFoundException extends Exception {
	
	public UserNotFoundException() {
		super("User with username is already present");
	}
	
	public UserNotFoundException(String msg) {
		super();
	}
}
