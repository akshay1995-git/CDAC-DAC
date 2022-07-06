package customException;

@SuppressWarnings("serial")
public class StudentHandlingException extends Exception {
	public StudentHandlingException(String errMsg) {
		super(errMsg);
	}
}
