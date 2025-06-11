package Activites;

public class StringisEmptyException extends Exception {
	private String message;
	public StringisEmptyException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		return "the error happens because:"+this.message;
	}
	
}
