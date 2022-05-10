package com.xworkz.toothpaste.exceptions;

public class MemoryIsFullException extends RuntimeException {

	public MemoryIsFullException() {

	}

	public MemoryIsFullException(String msg) {
		super(msg);
	}

}
