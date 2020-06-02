package ups.edu.ec.Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String ISBN;
	private int numero_paginas;
	private List<Capitulos> capitulos;
	
	
	public Libro(int codigo, String nombre, String iSBN, int numero_paginas, List<Capitulos> capitulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		ISBN = iSBN;
		this.numero_paginas = numero_paginas;
		this.capitulos = capitulos;
	}
	
	
	public Libro() {
		super();
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumero_paginas() {
		return numero_paginas;
	}
	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	public List<Capitulos> getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(List<Capitulos> capitulos) {
		this.capitulos = capitulos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		result = prime * result + ((capitulos == null) ? 0 : capitulos.hashCode());
		result = prime * result + codigo;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + numero_paginas;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		if (capitulos == null) {
			if (other.capitulos != null)
				return false;
		} else if (!capitulos.equals(other.capitulos))
			return false;
		if (codigo != other.codigo)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numero_paginas != other.numero_paginas)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", ISBN=" + ISBN + ", numero_paginas="
				+ numero_paginas + ", capitulos=" + capitulos + "]";
	}
	
	
	

	
	
	
}
