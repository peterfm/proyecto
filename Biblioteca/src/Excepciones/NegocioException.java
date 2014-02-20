package Excepciones;


@SuppressWarnings("serial")
public class NegocioException extends LibroException {

	public NegocioException() {
		super();
	}
	public NegocioException(String msg) { 
		super(msg);
	}
	
	public NegocioException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
