package teoria;

import java.util.Objects;

public class EjemploEqualsHasCode {
    public static void main(String[] args) {
        // Crear dos objetos con los mismos valores
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Juan", 25);
        Persona p3 = new Persona("Juanto", 15);

        // Verificar si los objetos son iguales
        System.out.println("p1 es igual a p2: " + p1.equals(p2));
        System.out.println("HashCode para la persona1: " + p1.hashCode());
        System.out.println("HashCode para la persona2: " + p2.hashCode());
        System.out.println("");
        // Aunque sean diferentes objetos, como el contenido es el mismo, se genera el mismo hashCode (Posible Teoria)

        System.out.println("p1 es igual a p3: " + p1.equals(p3));
        System.out.println("HashCode para la persona1: " + p1.hashCode());
        System.out.println("HashCode para la persona3: " + p3.hashCode());
    }
}

class Persona {
    String nombre;
    int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método equals para comparar dos objetos Persona
    @Override
    public boolean equals(Object obj) {
        // Verificar si los objetos son idénticos en memoria
        if (this == obj) return true;
        // Verificar si el objeto a comparar es nulo o de una clase diferente
        if (obj == null || getClass() != obj.getClass()) return false;
        // Convertir el objeto a comparar a tipo Persona
        Persona persona = (Persona) obj;
        // Comparar las propiedades nombre y edad de los objetos
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    // Método hashCode para generar un código hash único para cada objeto Persona
    @Override
    public int hashCode() {
        // Generar un código hash basado en las propiedades nombre y edad
        return Objects.hash(nombre, edad);
    }
}
