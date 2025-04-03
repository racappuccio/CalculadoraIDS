package CalculadoraIDS;
import java.util.Scanner;

public class Division {

    public static void dividir(Scanner scanner) {
        boolean continuar;
        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            int num1 = Validar.validarEnteroPositivo(scanner);
            System.out.print("Ingrese el segundo número entero positivo (distinto de 0): ");
            int num2;
            do {
                num2 = Validar.validarEnteroPositivo(scanner);
                if (num2 == 0) {
                    System.out.println("Error: El divisor no puede ser 0. Intente nuevamente.");
                }
            } while (num2 == 0);

            int mayor = Math.max(num1, num2);
            int menor = Math.min(num1, num2);
            int resultado = mayor / menor;

            System.out.println("El resultado de la división es: " + resultado);

             continuar = Validar.validarContinuar(scanner, "división");
        } while (continuar);
    }

}
