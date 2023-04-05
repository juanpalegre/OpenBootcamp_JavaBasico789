package ejercicio_7;

/**
 * Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
 *
 */

public class DivPorCero {

    public static void main(String[] args) {

        try {
            int miVar = dividePorCero();
            System.out.println(miVar);
        }catch (Exception e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }

    }

    public static int dividePorCero() throws ArithmeticException{
        int numerador = 10;
        int denominador = 0;
        return numerador / denominador;
    }
}
