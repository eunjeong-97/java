package section230902.access02;

public class InputErrorException extends Exception {
	
	// 객체를 직렬화할때 사용함
	private static final long serialVersionUID = 1L;
	private String message;
	public InputErrorException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return this.message;
	}
}
