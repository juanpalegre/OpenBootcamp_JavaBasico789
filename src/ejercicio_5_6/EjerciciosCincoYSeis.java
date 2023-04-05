package ejercicio_5_6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *Ejercicio 5: Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
 *Ejercicio 6: Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
 **/

public class EjerciciosCincoYSeis {

    public static void main(String[] args) {

        //Ejercicio 5
        ArrayList<String> primerArray = new ArrayList<>();
        primerArray.add("elemento 1");
        primerArray.add("elemento 2");
        primerArray.add("elemento 3");
        primerArray.add("elemento 4");

        LinkedList<String> segundoArray = new LinkedList<>();
        segundoArray.addAll(primerArray);

        System.out.println(primerArray);
        System.out.println(segundoArray);

        //Ejercicio 6
        ArrayList<Integer> tercerArray = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++){
            tercerArray.add(i);
        }

        for (int i = 0; i < tercerArray.size(); i++){
            if (tercerArray.get(i)%2 == 0){
                tercerArray.remove(i);
            }
        }

        for (int elemento: tercerArray){
            System.out.println(elemento);
        }
    }

}
