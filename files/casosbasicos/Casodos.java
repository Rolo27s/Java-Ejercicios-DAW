package casosbasicos;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Casodos {
    public static void main(String[] args) {
        // Nombre del archivo de entrada y salida
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";

        // Contador de vocales
        int contadorVocales = 0;

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
                // System.out.println(linea);
                
                // Contar las vocales en la línea actual
                contadorVocales += contarVocales(linea);
                
                // Escribir la línea en el archivo de salida
                // writer.write(linea + "\n");
            }

            // Escribir el número de vocales en el archivo de salida
            writer.write("Numero de vocales contadas = " + contadorVocales);

            // Cerrar los objetos de lectura y escritura
            reader.close();
            writer.close();

            System.out.println("El archivo de salida se ha creado correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer/escribir el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para contar vocales en una cadena de texto
    public static int contarVocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char caracter = Character.toLowerCase(texto.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'  
            || caracter == 'á' || caracter == 'é' || caracter == 'í' || caracter == 'ó' || caracter == 'ú') {
                contador++;
            }
        }
        return contador;
    }
}
