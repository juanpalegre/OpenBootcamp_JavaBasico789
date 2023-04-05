package ejercicio_8;

import javax.imageio.IIOException;
import java.io.*;

/**
 * Ejercicio 8: Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
 */

public class StreamEx {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\juanp\\IdeaProjects\\OpenBootcamp_JavaBasico789\\src\\ejercicio_8\\archivoOrigen.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("archivoDestino.txt");
            copiarDatos(fileInputStream, fileOutputStream);
            System.out.println("Copia Exitosa!");
        }catch (Exception e){
            System.out.println("Ocurrió un error: " + e.getMessage());
        }

    }

    public static void copiarDatos(InputStream fileIn, OutputStream fileOut) throws IOException {
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fileIn.read(buffer)) != -1){
            fileOut.write(buffer, 0, bytesRead);
        }

        fileIn.close();
        fileOut.close();
    }

}
