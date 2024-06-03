package Ejercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Libreria {
	private String nombre;
	private String direccion;
	private List<Libro> listaLibros;
	
	public Libreria(String nombre, String direccion, List<Libro> listaLibros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaLibros = listaLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", direccion=" + direccion + ", listaLibros=" + listaLibros + "]";
	}
	 
	public List<String> listadoAutoresOrdenadosAlfabeticamente() {
		// Creamos un conjunto (Set) llamado autoresSet para almacenar los autores únicos. Usamos un conjunto para garantizar que no haya duplicados.
        Set<Autor> autoresSet = new HashSet<>();

		/* Iteramos sobre la lista de libros (listaLibros). 
		Por cada libro, obtenemos su autor usando el método getAutor() y lo agregamos al conjunto autoresSet. */
        for (Libro libro : listaLibros) {
            autoresSet.add(libro.getAutor());
        }

		/* Convertimos el conjunto autoresSet a una lista (List) llamada autores. 
		Hacemos esto para poder ordenar los autores alfabéticamente. */
        List<Autor> autores = new ArrayList<>(autoresSet);

		/* Ordenamos la lista de autores (autores) utilizando un comparador (Comparator). 
		En este caso, estamos comparando los apellidos de los autores y luego, 
		si los apellidos son iguales, estamos comparando los nombres. 
		Esto nos da un orden alfabético de los autores por sus apellidos y, en caso de empate, por sus nombres. */
        autores.sort(Comparator.comparing(Autor::getApellidos).thenComparing(Autor::getNombre));

		// Creamos una nueva lista llamada nombresAutores para almacenar los nombres formateados de los autores en el orden deseado.
        List<String> nombresAutores = new ArrayList<>();

		/* Iteramos sobre la lista ordenada de autores (autores). 
		Por cada autor, obtenemos sus apellidos y nombre, los concatenamos en un solo String y los agregamos a la lista nombresAutores. */
        for (Autor autor : autores) {
            nombresAutores.add(autor.getApellidos() + ", " + autor.getNombre());
        }

		// Devolvemos la lista de nombres de autores ordenados alfabéticamente.
        return nombresAutores;
    }

	public Set<Autor> listadoAutores() {
		// Creamos un conjunto (Set) llamado autoresSet para almacenar los autores únicos. 
		// Usamos un conjunto para garantizar que no haya duplicados.
        Set<Autor> autoresSet = new HashSet<>();

		/* Iteramos sobre la lista de libros (listaLibros). 
		Por cada libro, obtenemos su autor usando el método getAutor() y lo agregamos al conjunto autoresSet. */
        for (Libro libro : listaLibros) {
            autoresSet.add(libro.getAutor());
        }

		/* Una vez que hemos iterado sobre todos los libros y agregado sus autores al conjunto, 
		simplemente devolvemos el conjunto de autores. */
        return autoresSet;
    }

	// Se le pasa el parámetro autor para saber quien es el autor de la lista a devolver
	public List<Libro> listadoLibrosAutor(Autor autor) {
		/* Creamos una lista vacía llamada librosAutor para almacenar los libros del autor dado. 
		Utilizamos una lista porque necesitaremos ordenar los libros más adelante. */
        List<Libro> librosAutor = new ArrayList<>();

		/* Iteramos sobre la lista de libros (listaLibros). 
		Por cada libro, verificamos si el autor del libro es igual al autor pasado como parámetro. 
		Esto lo hacemos comparando los objetos autor utilizando el método equals(). 
		Si el autor del libro coincide con el autor dado, agregamos ese libro a la lista librosAutor. */
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equals(autor)) {
                librosAutor.add(libro);
            }
        }

		/* Después de haber iterado sobre todos los libros y agregado los libros del autor dado a la lista librosAutor, 
		ordenamos esta lista de libros alfabéticamente por el título. 
		Esto se hace utilizando el método sort() de la lista, 
		pasando un comparador que compara los títulos de los libros. */
        librosAutor.sort(Comparator.comparing(Libro::getTitulo));

		// Devolvemos la lista librosAutor que contiene los libros del autor dado, ordenados alfabéticamente por el título.
        return librosAutor;
    }

	public List<Libro> listadoLibrosPorAnho(String anho) {
		/* Creamos una lista vacía llamada librosPorAnho para almacenar los libros publicados en el año especificado. 
		Utilizamos una lista porque necesitaremos ordenar los libros más adelante. */
        List<Libro> librosPorAnho = new ArrayList<>();

		/* Iteramos sobre la lista de libros (listaLibros). 
		Por cada libro, obtenemos el año de publicación utilizando el método getAnhoPublicacion(). 
		Convertimos este año a String utilizando String.valueOf() para poder compararlo con el año especificado pasado como parámetro. 
		Si el año de publicación del libro es igual al año especificado, agregamos ese libro a la lista librosPorAnho. */
        for (Libro libro : listaLibros) {
            if (String.valueOf(libro.getAnhoPublicacion()).equals(anho)) {
                librosPorAnho.add(libro);
            }
        }

		/* Después de haber iterado sobre todos los libros y agregado los libros publicados en el año especificado a la lista librosPorAnho, 
		ordenamos esta lista de libros alfabéticamente por el título. 
		Esto se hace utilizando el método sort() de la lista, pasando un comparador que compara los títulos de los libros. */
        librosPorAnho.sort(Comparator.comparing(Libro::getTitulo));

		// Devolvemos la lista librosPorAnho que contiene los libros publicados en el año especificado, ordenados alfabéticamente por el título.
        return librosPorAnho;
    }

}
