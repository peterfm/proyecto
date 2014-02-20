package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Excepciones.DaoException;
import modelo.Libro;

public class LibroDaoImpl implements ILibroDao {

	private Connection con;

	static {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public LibroDaoImpl() throws SQLException {
		con = DriverManager.getConnection(URL, USUARIO, CLAVE);
	}

	@Override
	public void agregar(Libro l) throws DaoException {
		String query = "INSERT INTO libro (isbn, titulo) VALUES(?, ?)";

		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(query);

			pstmt.setString(1, l.getIsbn());
			pstmt.setString(2, l.getTitulo());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException("Error al obtener libros", e);
		}
	}

	@Override
	public List<Libro> obtenerLibrosPorTitulo() throws DaoException {
		String query = "SELECT * FROM libro ORDER BY titulo";

		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			return ConvertirEnLibros(rs);
		} catch (SQLException e) {
			throw new DaoException("Error al obtener libros", e);
		}
	}

	private List<Libro> ConvertirEnLibros(ResultSet rs) throws SQLException {
		List<Libro> libros = null;
		while (rs.next()) {
			if (libros == null)
				libros = new ArrayList<Libro>();

			Libro l = new Libro(rs.getInt("id"), rs.getString("isbn"),
					rs.getString("titulo"));
			libros.add(l);
		}
		return libros;
	}

}
