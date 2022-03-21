package br.aca.senac.traducao.domain.exception;

public class TradutorException extends Exception {

	private static final long serialVersionUID = -3910062674915507280L;

	public TradutorException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public TradutorException(String message, Throwable cause) {
		super(message, cause);
	}

	public TradutorException(String message) {
		super(message);
	}

	public TradutorException(Throwable cause) {
		super(cause);
	}
}
