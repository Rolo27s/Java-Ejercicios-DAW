package casosbasicos;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Casotres {
    public static void main(String[] args) {
        // Nombre del archivo de entrada
        String archivoEntrada = "entrada.txt";

        // Indicador de si se encontró la palabra "java"
        boolean encontrada = false;

        // Lectura del archivo de entrada
        try {
            // Crear un objeto File para el archivo de entrada
            File inputFile = new File(archivoEntrada);

            // Crear un objeto BufferedReader para leer el archivo de entrada
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Patrón para buscar la palabra "java" como palabra independiente
            Pattern pattern = Pattern.compile("\\bjava\\b", Pattern.CASE_INSENSITIVE);

            // Leer línea por línea del archivo de entrada
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Buscar coincidencias del patrón en la línea actual
                Matcher matcher = pattern.matcher(linea);
                if (matcher.find()) {
                    encontrada = true;
                    break; // Terminar el bucle si se encuentra la palabra
                }
            }

            // Cerrar el objeto de lectura
            reader.close();

            // Mostrar el resultado por consola
            if (encontrada) {
                System.out.println("Se encontró la palabra 'java' en el archivo.");
            } else {
                System.out.println("No se encontró la palabra 'java' en el archivo.");
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
