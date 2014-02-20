package negocio;

import java.util.List;

import Excepciones.NegocioException;
import modelo.Libro;


public interface ILibroService {
	public void agregarLibro(Libro l) throws NegocioException;
	public List<Libro> obtenerLibrosPorTitulo() throws NegocioException;
}
