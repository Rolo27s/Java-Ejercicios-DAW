package teoria;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueueLinkedList {
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_linkedlist.asp
        Queue<String> cola = new LinkedList<>();

        // Agregar elementos a la cola
        cola.offer("A");
        cola.offer("B");
        cola.offer("C");

        // Eliminar y obtener el primer elemento de la cola
        String primero = cola.poll();
        System.out.println("Primer elemento de la cola: " + primero);

        // Imprimir la cola
        System.out.println("Cola: " + cola);
    }
}
