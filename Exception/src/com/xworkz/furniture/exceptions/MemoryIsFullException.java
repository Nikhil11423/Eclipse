package com.xworkz.furniture.exceptions;

public class MemoryIsFullException extends RuntimeException {

	public MemoryIsFullException() {

	}

	public MemoryIsFullException(String msg) {
		super(msg);
	}

}
