package jpa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PERSONA database table.
 * 
 */
@Entity
@Table(name="PERSONA")
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(unique=true, nullable=false)
	private int id;

	private double altura;

	@Column(nullable=false, length=50)
	private String apellido;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;

	@Column(nullable=false, length=50)
	private String nombre;

	//bi-directional many-to-one association to Ordenador
	@OneToMany(mappedBy="persona")
	private List<Ordenador> ordenadores;

	public Persona() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ordenador> getOrdenadores() {
		return this.ordenadores;
	}

	public void setOrdenadores(List<Ordenador> ordenadores) {
		this.ordenadores = ordenadores;
	}

	public Ordenador addOrdenadore(Ordenador ordenadore) {
		getOrdenadores().add(ordenadore);
		ordenadore.setPersona(this);

		return ordenadore;
	}

	public Ordenador removeOrdenadore(Ordenador ordenadore) {
		getOrdenadores().remove(ordenadore);
		ordenadore.setPersona(null);

		return ordenadore;
	}

}