package com.mycompany.calculadoraids;
import java.util.Scanner;

public class Division {

    public static void dividir(Scanner scanner) {
        boolean continuar;
        do {
            System.out.print("Ingrese el primer número entero positivo: ");
            int num1 = Validar.validarEnteroPositivo(scanner);
            System.out.print("Ingrese el segundo número entero positivo (distinto de 0): ");
            int num2 = Validar.validarDivisor(scanner);
            
            //Verifica que el cociente se efectúe utilizando en primer término el mayor número ingresado y, en segundo término, el menor número ingresado
            int mayor = Math.max(num1, num2); //obtiene el numero mayor entre num1 y num2, y se guarda el valor en la variable mayor
            int menor = Math.min(num1, num2);
            int resultado = mayor / menor;

            System.out.println("El resultado de la división es: " + resultado);

             continuar = Validar.validarContinuar(scanner, "división");
        } while (continuar);
    }
}