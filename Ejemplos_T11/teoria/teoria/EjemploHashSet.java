package teoria;

import java.util.Set;
import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_hashset.asp
        Set<String> conjunto = new HashSet<>();

        // Agregar elementos al conjunto
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
        conjunto.add("A"); // Este elemento no se agregará porque ya existe

        // Imprimir el conjunto
        System.out.println("Conjunto: " + conjunto);
    }
}
