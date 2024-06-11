// Libreria.java
package Ejercicio1;

import java.util.ArrayList;
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
        Set<Autor> autoresSet = new HashSet<>();
        for (Libro libro : listaLibros) {
            autoresSet.add(libro.getAutor());
        }
        List<Autor> autores = new ArrayList<>(autoresSet);
        autores = ordenarAutoresAlfabeticamente(autores);
        List<String> nombresAutores = new ArrayList<>();
        for (Autor autor : autores) {
            nombresAutores.add(autor.getApellidos() + ", " + autor.getNombre());
        }
        return nombresAutores;
    }

    public Set<Autor> listadoAutores() {
        Set<Autor> autoresSet = new HashSet<>();
        for (Libro libro : listaLibros) {
            autoresSet.add(libro.getAutor());
        }
        return autoresSet;
    }

    public List<Libro> listadoLibrosAutor(Autor autor) {
        List<Libro> librosAutor = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equals(autor)) {
                librosAutor.add(libro);
            }
        }
        librosAutor = ordenarLibrosPorTitulo(librosAutor);
        return librosAutor;
    }

    public List<Libro> listadoLibrosPorAnho(String anho) {
        List<Libro> librosPorAnho = new ArrayList<>();
        for (Libro libro : listaLibros) {
            if (String.valueOf(libro.getAnhoPublicacion()).equals(anho)) {
                librosPorAnho.add(libro);
            }
        }
        librosPorAnho = ordenarLibrosPorTitulo(librosPorAnho);
        return librosPorAnho;
    }

    private List<Autor> ordenarAutoresAlfabeticamente(List<Autor> autores) {
        for (int i = 0; i < autores.size() - 1; i++) {
            for (int j = i + 1; j < autores.size(); j++) {
                if (compararAutores(autores.get(i), autores.get(j)) > 0) {
                    Autor temp = autores.get(i);
                    autores.set(i, autores.get(j));
                    autores.set(j, temp);
                }
            }
        }
        return autores;
    }

    private int compararAutores(Autor a1, Autor a2) {
        int apellidosComparison = a1.getApellidos().compareTo(a2.getApellidos());
        if (apellidosComparison != 0) {
            return apellidosComparison;
        }
        return a1.getNombre().compareTo(a2.getNombre());
    }

    private List<Libro> ordenarLibrosPorTitulo(List<Libro> libros) {
        for (int i = 0; i < libros.size() - 1; i++) {
            for (int j = i + 1; j < libros.size(); j++) {
                if (libros.get(i).getTitulo().compareTo(libros.get(j).getTitulo()) > 0) {
                    Libro temp = libros.get(i);
                    libros.set(i, libros.get(j));
                    libros.set(j, temp);
                }
            }
        }
        return libros;
    }
}
