package teoria;

import java.util.*;

public class EjemploComparableComparator {
    public static void main(String[] args) {
        // Ejemplo de Comparable
        List<PersonaComparable> personas = new ArrayList<>();
        personas.add(new PersonaComparable("Juan", 25));
        personas.add(new PersonaComparable("Ana", 30));
        personas.add(new PersonaComparable("Pedro", 20));

        // Ordenar las personas por edad usando Comparable
        Collections.sort(personas);

        // Imprimir las personas ordenadas
        System.out.println("Personas ordenadas por edad: " + personas);

        // Ejemplo de Comparator
        List<PersonaComparator> personas2 = new ArrayList<>();
        personas2.add(new PersonaComparator("Juan", 25));
        personas2.add(new PersonaComparator("Ana", 22));
        personas2.add(new PersonaComparator("Pedro", 20));

        // Ordenar las personas por nombre usando Comparator
        Collections.sort(personas2, new ComparadorPorNombre());

        // Imprimir las personas ordenadas por nombre
        System.out.println("Personas ordenadas por nombre: " + personas2);
    }
}

// Implementación de Comparable
class PersonaComparable implements Comparable<PersonaComparable> {
    String nombre;
    int edad;

    public PersonaComparable(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(PersonaComparable otraPersona) {
        return Integer.compare(this.edad, otraPersona.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

// Implementación de Comparator
class PersonaComparator {
    String nombre;
    int edad;

    public PersonaComparator(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

// Comparador externo para ordenar por nombre
class ComparadorPorNombre implements Comparator<PersonaComparator> {
    @Override
    public int compare(PersonaComparator persona1, PersonaComparator persona2) {
        return persona1.nombre.compareTo(persona2.nombre);
    }
}
