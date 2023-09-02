package section230902.access02;

public class InputErrorException extends Exception {
	private String message;
	public InputErrorException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}