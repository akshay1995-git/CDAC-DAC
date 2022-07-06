package cust_exception;

@SuppressWarnings("serial")
public class BookHandlingException extends Exception {
	public BookHandlingException(String mesg) {
		super(mesg);
	}
}
