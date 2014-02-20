package Excepciones;

@SuppressWarnings("serial")
public class DaoException extends LibroException {

	public DaoException() {
		// TODO Auto-generated constructor stub
	}

	public DaoException(String msg) { 
		super(msg);
	}
	
	public DaoException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
