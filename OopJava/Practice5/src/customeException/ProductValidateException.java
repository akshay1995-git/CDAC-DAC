package customeException;

@SuppressWarnings("serial")
public class ProductValidateException extends Exception{
public ProductValidateException(String msg) {
	super(msg);
}
}
