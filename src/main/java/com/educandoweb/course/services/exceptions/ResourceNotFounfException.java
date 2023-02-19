package com.educandoweb.course.services.exceptions;

public class ResourceNotFounfException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFounfException(Object id) {
		super("Resource not found. Id " + id);
	}
}
