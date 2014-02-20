package negocio;

import java.sql.SQLException;
import java.util.List;

import Excepciones.DaoException;
import Excepciones.NegocioException;
import dao.ILibroDao;
import dao.LibroDaoImpl;
import modelo.Libro;

public class LibroServiceImpl implements ILibroService {
	private ILibroDao libroDao;

	public LibroServiceImpl() throws NegocioException {
		try {
			libroDao = new LibroDaoImpl();
		} catch (SQLException e) {
			throw new NegocioException("Error inicializando LibroDaoImpl", e);
		}
	}

	@Override
	public void agregarLibro(Libro l) throws NegocioException {
		try {
			libroDao.agregar(l);
		} catch (DaoException e) {
			throw new NegocioException("Error agregando libro", e);
		}
	}

	@Override
	public List<Libro> obtenerLibrosPorTitulo() throws NegocioException {
		try {
			return libroDao.obtenerLibrosPorTitulo();
		} catch (DaoException e) {
			throw new NegocioException("Error obteniendo libros por título", e);
		}
	}

}
