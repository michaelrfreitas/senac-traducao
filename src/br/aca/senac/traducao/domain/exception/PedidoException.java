package br.aca.senac.traducao.domain.exception;

public class PedidoException extends Exception{

	private static final long serialVersionUID = -8998678672991288084L;

	public PedidoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PedidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public PedidoException(String message) {
		super(message);
	}

	public PedidoException(Throwable cause) {
		super(cause);
	}
}
