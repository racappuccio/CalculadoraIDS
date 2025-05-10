package com.mycompany.calculadoraids;
import java.util.Scanner;
/**
 * @brief Clase que contiene la operación de resta.
 */
public class Resta {
   /**
     * @brief Realiza la operación de resta entre dos números ingresados por el usuario.
     * @param scanner Objeto Scanner para la entrada del usuario.
     */
    public static void restar(Scanner scanner) {
        boolean continuar;
        do {
            int[] numeros = IngresarNum.pedirDosEnterosPositivos(scanner);

            int mayor = Math.max(numeros[0], numeros[1]);
            int menor = Math.min(numeros[0], numeros[1]);
            int resultado = mayor - menor;

            System.out.println("El resultado de la resta es: " + resultado);

            continuar = Validar.validarContinuar(scanner, "resta");
        } while (continuar);
    }

}
