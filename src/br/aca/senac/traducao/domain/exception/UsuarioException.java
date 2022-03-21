package br.aca.senac.traducao.domain.exception;

public class UsuarioException extends Exception {

	private static final long serialVersionUID = 1962481675282476577L;

	public UsuarioException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UsuarioException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsuarioException(String message) {
		super(message);
	}

	public UsuarioException(Throwable cause) {
		super(cause);
	}
}
