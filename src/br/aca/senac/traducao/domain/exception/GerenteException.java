package br.aca.senac.traducao.domain.exception;

public class GerenteException extends Exception {

	private static final long serialVersionUID = 5836806474028383365L;

	public GerenteException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public GerenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public GerenteException(String message) {
		super(message);
	}

	public GerenteException(Throwable cause) {
		super(cause);
	}
}
