package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {

    public void copiaOrdena(String fichero) {
        // Lista para almacenar las líneas del archivo
        List<String> lineasArchivo = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            // Leer cada línea del archivo y almacenarla en la lista
            while ((linea = br.readLine()) != null) {
                lineasArchivo.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Ordenar alfabéticamente las líneas
        Collections.sort(lineasArchivo);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("copiaordenada.txt"))) {
            // Escribir las líneas ordenadas en el archivo de salida
            for (String linea : lineasArchivo) {
                bw.write(linea);
                bw.newLine(); // Agregar salto de línea
            }
            System.out.println("Archivo copiaordenada.txt creado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
