package CalculadoraIDS;
import java.util.Scanner;

public class Suma {

    public static void sumar(Scanner scanner) {
        boolean continuar;
        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            int num1 = Validar.validarEnteroPositivo(scanner);
            System.out.print("Ingrese el segundo número entero positivo: ");
            int num2 = Validar.validarEnteroPositivo(scanner);

            int resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);

             continuar = Validar.validarContinuar(scanner, "suma");
        } while (continuar);
    }

}
