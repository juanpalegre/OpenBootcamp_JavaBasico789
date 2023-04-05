package ejercicio_0;

/**
 * Ejercicio 0: Escribir un código que devuelva una cadena al revés
 */

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverse("pelota"));

    }

    public static String reverse(String texto){

        String str = "";

        for(int i = texto.length() - 1; i >= 0  ; i--){
            str += texto.charAt(i);
        }

        return str;
    }
}
