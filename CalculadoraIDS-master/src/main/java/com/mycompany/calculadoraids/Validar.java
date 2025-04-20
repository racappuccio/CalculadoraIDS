package com.mycompany.calculadoraids;

import java.util.Scanner;

public class Validar {

    public static int validarEnteroPositivo(Scanner scanner) { // nos dimos cuenta de que el metodo validarEnteroPositivo y validarDivisor hacian la misma funcion de validar si el numero 
        int num;                                               // era un entero positivo y se paso la validacion de cero al metodo validarEnteroPositivo.
        while (true) {                                         //ademas se agrego un bloque try catch para el manejo de exepciones (de caracteres que no sean tipo int)
            try {
                System.out.print("Ingrese un número entero positivo: ");
                num = Integer.parseInt(scanner.next());
                if (num == 0) {
                    System.out.print("Error: El divisor no puede ser 0. Intente nuevamente: ");
                } else if (num > 0) {
                    return num;
                } else {
                    System.out.println("Error: El número debe ser mayor que cero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        }
    }

    public static boolean validarContinuar(Scanner scanner, String operacion) {
        String respuesta;
        while (true) {
            System.out.println("Desea realizar otra operacion? " + operacion + "(s/n)");
            respuesta = scanner.next().trim().toLowerCase();
            switch (respuesta) {
                case "s":
                    return true;
                case "n":
                    return false;
                default:
                    System.out.println("Error: debe ingresa's' para Si o ´n´ Para no.");
            }
        }
    }
}
