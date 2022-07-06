package custom_exception;

@SuppressWarnings("serial")
public class VolunteerHandlingException extends Exception {
public VolunteerHandlingException(String mesg) {
	super(mesg);
}
}
