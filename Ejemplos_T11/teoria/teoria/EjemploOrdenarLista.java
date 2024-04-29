package teoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploOrdenarLista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");

        // Ordenar los nombres alfabéticamente
        Collections.sort(nombres);

        // Imprimir los nombres ordenados
        System.out.println("Nombres ordenados: " + nombres);
    }
}
