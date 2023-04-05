package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Ejercicio 1: Crear un Array Unidimensional de Strings y recorrerlo mostrando solo sus valores.
 */

public class ArrayUnidimiensional {

    public static void main(String[] args) {

        mostrarAtributos(arrayProvider());

    }

    public static void mostrarAtributos(ArrayList<String> miArray){
        for (String elemento: miArray){
            System.out.println(elemento);
        }
    }

    public static ArrayList<String> arrayProvider(){

        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("elemento 1");
        miLista.add("elemento 2");
        miLista.add("elemento 3");
        miLista.add("elemento 4");
        miLista.add("elemento 5");
        miLista.add("elemento 6");

        return miLista;
    }

}
