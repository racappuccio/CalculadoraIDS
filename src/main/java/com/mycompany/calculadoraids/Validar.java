package com.mycompany.calculadoraids;
import java.util.Scanner;

/**
 * @brief Clase que contiene métodos de validación de entrada.
 */
public class Validar {
     /**
     * @brief Solicita al usuario un número entero positivo y valida que lo sea.
     * @param scanner Objeto Scanner para la entrada del usuario.
     * @return Número entero positivo ingresado por el usuario.
     */
    public static int validarEnteroPositivo(Scanner scanner) { 
        int num;                                             
        while (true) {                                        
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
/**
     * @brief Pregunta al usuario si desea continuar con la operación actual.
     * @param scanner Objeto Scanner para la entrada del usuario.
     * @param operacion Nombre de la operación que se está realizando.
     * @return true si el usuario desea continuar, false en caso contrario.
     */
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
