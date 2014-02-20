package dao;

import java.util.List;

import Excepciones.DaoException;
import modelo.Libro;

public interface ILibroDao extends IDao<Libro, Integer> {
	public List<Libro> obtenerLibrosPorTitulo() throws DaoException;
}
