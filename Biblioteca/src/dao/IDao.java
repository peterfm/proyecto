package dao;

import Excepciones.DaoException;

public interface IDao<TIPO, CLAVE> {
	public static final String URL = "jdbc:derby://localhost:1527/persona";
	public static final String USUARIO = "user";
	public static final String CLAVE = "123";

	public void agregar(TIPO obj) throws DaoException;
	//public List<TIPO> obtenerTodos() throws SQLException; // no se va a usar en el programa
}