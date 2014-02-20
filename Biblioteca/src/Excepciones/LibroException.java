package Excepciones;

@SuppressWarnings("serial")
public abstract class LibroException extends Exception {
	public LibroException() { 
		super();
	}
	
	public LibroException(String msg) { 
		super(msg);
	}
	
	public LibroException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
