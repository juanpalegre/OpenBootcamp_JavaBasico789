package ejercicio_3_4;

import java.util.Vector;

/**
 * Ejercico 3: Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
 * Ejercicio 4: Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
 */

public class EjercicioTresYCuatro {

    public static void main(String[] args) {

        Vector<Integer> miVector = new Vector<Integer>();
        miVector.add(1);
        miVector.add(2);
        miVector.add(3);
        miVector.add(4);
        miVector.add(5);

        miVector.remove(1);
        miVector.remove(2);

        System.out.println(miVector);
    }

    /*
    * Los vectores con tamaño por defecto pueden tener diferentes inconvenientes al tratar de incorporar 1000 elementos.
    * Uno de ellos es la ineficiencia de memoria, dado que al tener el tamaño por defecto, al agregar 1000 elementos
    * el vector seguramente requiera ser redimensionado, generando un nuevo bloque de memoria al cual le tengo que sumar
    * los elementos existentes mas los nuevos 1000 elementos.
    * Por otro lado, no menor, también agrega complejidad innecesaria al código.
    * */

}
