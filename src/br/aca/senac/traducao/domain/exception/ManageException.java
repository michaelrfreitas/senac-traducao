package br.aca.senac.traducao.domain.exception;

public class ManageException extends Exception {

	private static final long serialVersionUID = 8966616990811549605L;

	public ManageException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ManageException(String message, Throwable cause) {
		super(message, cause);
	}

	public ManageException(String message) {
		super(message);
	}

	public ManageException(Throwable cause) {
		super(cause);
	}

}
