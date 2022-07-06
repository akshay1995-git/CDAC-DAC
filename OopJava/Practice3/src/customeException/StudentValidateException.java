package customeException;

@SuppressWarnings("serial")
public class StudentValidateException extends Exception {
public StudentValidateException(String msg) {
	super(msg);
}
}
