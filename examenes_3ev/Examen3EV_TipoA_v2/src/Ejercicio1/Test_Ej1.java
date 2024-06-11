package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test_Ej1 {

	public static void main(String[] args) {
		Autor a1 = new Autor("Jane", "Austen", 1775);
		Autor a2 = new Autor("Ernest", "Hemingway", 1899);
		Autor a3 = new Autor("J.K.", "Rowling", 1965);
		Autor a4 = new Autor("Gabriel", "Garcia Marquez", 1927);
		Autor a5 = new Autor("Fyodor", "Dostoyevski", 1821);
		Autor a6 = new Autor("Harper", "Lee", 1926);
		Autor a7 = new Autor("Agatha", "Christie", 1890);
		Autor a8 = new Autor("Albert", "Camus", 1913);
		Autor a9 = new Autor("George", "Orwell", 1903);
		Autor a10 = new Autor("Emily", "Bronte", 1818);
		Autor a11 = new Autor("J.R.R.", "Tolkien", 1892);
		Autor a12 = new Autor("Virginia", "Woolf", 1882);
		Libro l1 = new Libro("Orgullo y prejuicio", a1, 1811);
		Libro l2 = new Libro("El viejo y el mar", a2, 1952);
		Libro l3 = new Libro("Harry Potter y la piedra filosofal", a3, 1997);
		Libro l4 = new Libro("Cien años de soledad", a4, 1967);
		Libro l5 = new Libro("Diez negritos", a7, 1939);
		Libro l6 = new Libro("Crimen y castigo", a5, 1866);
		Libro l7 = new Libro("Matar a un ruiseñor", a6, 1960);
		Libro l8 = new Libro("1984", a9, 1949);
		Libro l9 = new Libro("Cumbres Borrascosas", a10, 1847);
		Libro l10 = new Libro("Sentido y sensibilidad", a1, 1811);
		Libro l11 = new Libro("Adios a las armas", a2, 1929);
		Libro l12 = new Libro("Harry Potter y la cámara secreta", a3, 1998);
		Libro l13 = new Libro("El amor en los tiempos del colera", a8, 1985);
		Libro l14 = new Libro("Asesinato en el Orient Express", a7, 1934);
		Libro l15 = new Libro("Los hermanos Karamazov", a5, 1880);
		Libro l16 = new Libro("Rebelion en la granja", a9, 1945);
		Libro l17 = new Libro("El Hobbit", a11, 1937);
		Libro l18 = new Libro("El Señor de los Anillos", a11, 1954);
		Libro l19 = new Libro("Al faro", a12, 1927);
		Libro l20 = new Libro("Las olas", a12, 1931);
		Libro l21 = new Libro("El extranjero", a8, 1942);
		Libro l22 = new Libro("La peste", a8, 1947);
		List<Libro> listaLibros = new ArrayList<Libro>();
		listaLibros.add(l1);
		listaLibros.add(l2);
		listaLibros.add(l3);
		listaLibros.add(l4);
		listaLibros.add(l5);
		listaLibros.add(l6);
		listaLibros.add(l7);
		listaLibros.add(l8);
		listaLibros.add(l9);
		listaLibros.add(l10);
		listaLibros.add(l11);
		listaLibros.add(l12);
		listaLibros.add(l13);
		listaLibros.add(l14);
		listaLibros.add(l15);
		listaLibros.add(l16);
		listaLibros.add(l17);
		listaLibros.add(l18);
		listaLibros.add(l19);
		listaLibros.add(l20);
		listaLibros.add(l21);
		listaLibros.add(l22);
		Libreria libreria = new Libreria("Las hojas perdidas", "C/Gutemberg", listaLibros);
		 
		List<String> listaAutoresAlfab = libreria.listadoAutoresOrdenadosAlfabeticamente();
		System.out.println("\nListado de autores ordenados alfabéticamente");
		System.out.println("-------------------------------------------");
		for (String autor : listaAutoresAlfab) {
			System.out.println(autor);
		}		

		Set<Autor> listaAutores = libreria.listadoAutores();
		System.out.println("\nListado de autores");
		System.out.println("-------------------------------------------");
		for (Autor autor : listaAutores) {
			System.out.println(autor);
		}

		List<Libro> listaLibrosAutor = libreria.listadoLibrosAutor(a8);
		System.out.println("\nListado de libros por autor");
		System.out.println("-------------------------------------------");
		for (Libro libro : listaLibrosAutor) {
			System.out.println(libro);
		}

		List<Libro> listaLibrosAnho = libreria.listadoLibrosPorAnho("1811");
		System.out.println("\nListado de libros por anho");
		System.out.println("-------------------------------------------");
		for (Libro libro : listaLibrosAnho) {
			System.out.println(libro);
		}

	}

}
