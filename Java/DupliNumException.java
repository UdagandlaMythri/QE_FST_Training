package Activites;

public class DupliNumException extends Exception {
	private String message;
	public DupliNumException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	public String getMessage() {
		return "the error happened because:"+this.message;
	}
}
