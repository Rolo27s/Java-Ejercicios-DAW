package teoria;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_arraylist.asp
        List<Integer> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2); // Este elemento se agregará, las listas permiten duplicados

        // Imprimir la lista
        System.out.println("Lista: " + lista);
    }
}
