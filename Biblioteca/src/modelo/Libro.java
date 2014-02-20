package modelo;

public class Libro {
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", isbn=" + isbn + ", título = " + titulo +  " ]";
	}

	private Integer id;
	private String titulo;
	private String isbn;
	
	public Libro(Integer id, String isbn, String titulo) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
