package com.mycompany.calculadoraids;
import java.util.Scanner;

public class Multiplicacion {

    public static void multiplicar(Scanner scanner) {
        boolean continuar;
        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            int num1 = Validar.validarEnteroPositivo(scanner);
            System.out.print("Ingrese el segundo número entero positivo: ");
            int num2 = Validar.validarEnteroPositivo(scanner);

            int resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);

            continuar = Validar.validarContinuar(scanner, "multiplicación");
        } while (continuar);
    }

}
