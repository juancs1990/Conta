package exceptions;

public class AccountError extends Exception {
	private static final long serialVersionUID = 1L;
	
	public AccountError(String msg) {
		super(msg);
	}

}
