package gui;

import java.util.List;
import java.util.Scanner;

import Excepciones.NegocioException;
import modelo.Libro;
import negocio.ILibroService;
import negocio.LibroServiceImpl;

public class Menu {
	public Scanner scanner;
	private ILibroService libroService;

	public Menu() {
		this.scanner = new Scanner(System.in);
		try {
			this.libroService = new LibroServiceImpl();
		} catch (NegocioException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public void iniciar() {
		while (true) {
			System.out.println();
			System.out.println("1. Agregar un libro");
			System.out.println("2. Lista de libros por título");
			System.out.println("3. Salir");
			System.out.println("? ");

			String opcion = scanner.nextLine();
			if (opcion.equals("1"))
				agregarLibro();
			else if (opcion.equals("2")) 
				listarLibrosPorTitulo();
			else if (opcion.equals("3"))
				break;
		}
	}

	private void listarLibrosPorTitulo() {
		try {
			List<Libro> personas = libroService.obtenerLibrosPorTitulo();

			for (Libro p : personas)
				System.out.println(p);
			System.out.println("");
			System.out.println("Pulse una tecla");
			scanner.nextLine();

		} catch (NegocioException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private void agregarLibro() {
		System.out.print("ISBN: ");
		String isbn = scanner.nextLine();

		System.out.print("Título: ");
		String titulo = scanner.nextLine();

		Libro l = new Libro(null, isbn, titulo);
		try {
			libroService.agregarLibro(l);
		} catch (NegocioException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
