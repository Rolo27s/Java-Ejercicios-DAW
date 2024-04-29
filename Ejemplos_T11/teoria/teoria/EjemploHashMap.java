package teoria;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_hashmap.asp
        Map<String, Integer> mapa = new HashMap<>();

        // Agregar elementos al mapa
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);
        mapa.put("A", 4); // Este elemento actualizará el valor de la clave "A"

        // Imprimir el mapa
        System.out.println("Mapa: " + mapa);
    }
}
