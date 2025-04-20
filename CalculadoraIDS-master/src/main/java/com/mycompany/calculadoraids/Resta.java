package com.mycompany.calculadoraids;
import java.util.Scanner;

public class Resta {

    public static void restar(Scanner scanner) {
        boolean continuar;
        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            int num1 = Validar.validarEnteroPositivo(scanner);
            System.out.print("Ingrese el segundo número entero positivo: ");
            int num2 = Validar.validarEnteroPositivo(scanner);

            int mayor = Math.max(num1, num2);
            int menor = Math.min(num1, num2);
            int resultado = mayor - menor;

            System.out.println("El resultado de la resta es: " + resultado);

            continuar = Validar.validarContinuar(scanner, "resta");
        } while (continuar);
    }

}
