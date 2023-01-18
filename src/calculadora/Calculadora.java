
package calculadora;

 /**
* Esta clase representa una calculadora básica.
* Incluye métodos para sumar, restar, multiplicar y dividir.
*
* @author M.Angel Vera Lorenzo
* @version 1.1
*/
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingresa el primer número:");
        int a = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int b = scanner.nextInt();

        System.out.println("Selecciona la operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int operation = scanner.nextInt();

        int result = 0;
        switch (operation) {
            case 1:
                result = suma(a, b);
                break;
            case 2:
                result = resta(a, b);
                break;
            case 3:
                result = multiplicar(a, b);
                break;
            case 4:
                result = dividir(a, b);
                break;
            default:
                System.out.println("Operación no válida");
                break;
        }

        if (operation >= 1 && operation <= 4) {
            System.out.println("Resultado: " + result);
        }

        scanner.close();
    }

    /**
     *
     * @param a es el primer valor int introducido por teclado
     * @param b es el segundo valor int introducido por teclado
     * @return es el resultado de la suma de ambas cifras
     */
    public static int suma(int a, int b) {
        return a + b;
    }

    /**
     *
     * @param a es el primer valor int introducido por teclado
     * @param b es el segundo valor int introducido por teclado
     * @return es el resultado de la resta de ambas cifras
     */
    public static int resta(int a, int b) {
        return a - b;
    }

    /**
     *
     * @param a es el primer valor int introducido por teclado
     * @param b es el segundo valor int introducido por teclado
     * @return es el resultado de la multiplicacion de ambas cifras
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     *
     * @param a es el primer valor int introducido por teclado
     * @param b es el segundo valor int introducido por teclado
     * @return es el resultado de la division de ambas cifras
     */
    public static int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: división por cero");
            return 0;
        }
        return a / b;
    }
}

