package com.xworkz.customer.exception;

	public class InvalidDataException extends RuntimeException{

		public InvalidDataException() {

		}

		public InvalidDataException(String msg) {
			super(msg);
		}

}
