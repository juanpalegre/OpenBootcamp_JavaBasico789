package ejercicio_2;

/**
 * Ejercicio 2: Crear un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
 */

public class ArrayBidimensional {

    public static void main(String[] args) {
        mostrarElementos(arrayProvider());
    }

    public static void mostrarElementos(int[][] miArray){
        for (int i = 0 ; i < miArray.length ; i++){
            for (int j = 0 ; j < miArray[i].length ; j++){
                System.out.println("Valor: " + miArray[i][j] + " Indice: " + i + " - " + j);
            }
        }
    }

    public static int[][] arrayProvider(){

        int[][] arrBidimensional = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        return arrBidimensional;
    }
}
