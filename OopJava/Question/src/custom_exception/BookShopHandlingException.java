package custom_exception;

public class BookShopHandlingException extends Exception {
	private static final long serialVersionUID = 1L;

	public BookShopHandlingException(String msg) {
		super(msg);
	}

}
