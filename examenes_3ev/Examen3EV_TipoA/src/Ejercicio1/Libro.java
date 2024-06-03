package Ejercicio1;

import java.util.Objects;

//Modificar o incluir lo que haga falta para poder ordenar los libros por año de publicación
public class Libro {
	private String titulo;
	private Autor autor;
	private Integer anhoPublicacion;
	
	public Libro(String titulo, Autor autor, Integer anhoPublicacion) {
		this.titulo = titulo;
		this.autor = autor;
		this.anhoPublicacion = anhoPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Integer getAnhoPublicacion() {
		return anhoPublicacion;
	}

	public void setAnhoPublicacion(Integer anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anhoPublicacion, autor, titulo);
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
		return Objects.equals(anhoPublicacion, other.anhoPublicacion) && Objects.equals(autor, other.autor)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anhoPublicacion=" + anhoPublicacion + "]";
	}
	
}
