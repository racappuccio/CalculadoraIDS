package com.mycompany.calculadoraids;
import java.util.Scanner;
public class Validar {

    public static int validarEnteroPositivo(Scanner scanner) {
        int num;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Error: Debe ingresar un número entero positivo. Intente nuevamente: ");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num > 0) {
                return num;
            } else {
                System.out.print("Error: El número debe ser positivo y mayor que cero. Intente nuevamente: ");
                }
            } 
        }
    
    
    public static int validarDivisor(Scanner scanner) {
        int num;
        while (true) {
            while (!scanner.hasNextInt()) {
                System.out.print("Error: Debe ingresar un número entero positivo. Intente nuevamente: ");
                scanner.next();
            }
            num = scanner.nextInt();
            if (num == 0){
                System.out.print("Error: El divisor no puede ser 0. Intente nuevamente: ");
            } else {
                if (num > 0) {
                    return num;
                } else {
                    System.out.print("Error: El número debe ser positivo y mayor que cero. Intente nuevamente: ");
                }
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

