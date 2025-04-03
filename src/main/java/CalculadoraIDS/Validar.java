package CalculadoraIDS;
import java.util.Scanner;
public class Validar {

    public static int validarEnteroPositivo(Scanner scanner) {
        int num;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero positivo.");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num > 0) {
                return num;
            } else {
                System.out.println("Error: El número debe ser positivo y mayor que cero.");
            }
        }
    }
      public static boolean validarContinuar(Scanner scanner, String operacion) {
        String respuesta;
        do {
            System.out.print("¿Desea realizar otra " + operacion + "? (s/n): ");
            respuesta = scanner.next().toLowerCase();
            if (!respuesta.equals("s") && !respuesta.equals("n")) {
                System.out.println("Error: Debe ingresar 's' para sí o 'n' para no.");
            }
        } while (!respuesta.equals("s") && !respuesta.equals("n"));
        return respuesta.equals("s");
    }

}

