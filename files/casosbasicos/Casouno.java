package casosbasicos;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Casouno {
    public static void main(String[] args) {
        // Nombre del archivo de entrada y salida
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";

        // Lectura del archivo de entrada y escritura en el archivo de salida
        try {
            // Crear un objeto File para el archivo de entrada
            File inputFile = new File(archivoEntrada);

            // Crear un objeto BufferedReader para leer el archivo de entrada
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Crear un objeto FileWriter para escribir en el archivo de salida
            FileWriter writer = new FileWriter(archivoSalida);

            // Leer línea por línea del archivo de entrada y escribir en el archivo de salida
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Aquí puedes hacer cualquier operación con la línea leída, por ejemplo, imprimir en consola
                System.out.println(linea);
                
                // Escribir la línea en el archivo de salida
                writer.write(linea + "\n");
            }

            // Cerrar los objetos de lectura y escritura
            reader.close();
            writer.close();

            System.out.println("El archivo de salida se ha creado correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer/escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}