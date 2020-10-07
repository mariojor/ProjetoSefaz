package br.com.sefaz.exception;

public class ErrorGeneralException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ErrorGeneralException(String msg) {
		super(msg);
	}

	public ErrorGeneralException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
}
