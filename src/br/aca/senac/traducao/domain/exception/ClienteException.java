package br.aca.senac.traducao.domain.exception;

public class ClienteException extends Exception {

	private static final long serialVersionUID = 444722870411270144L;

	public ClienteException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClienteException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClienteException(String message) {
		super(message);
	}

	public ClienteException(Throwable cause) {
		super(cause);
	}
}
