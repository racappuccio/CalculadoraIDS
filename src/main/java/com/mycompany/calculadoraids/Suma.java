package com.mycompany.calculadoraids;
import java.util.Scanner;

/**
 * @brief Clase que contiene la operación de suma.
 */
public class Suma {
 /**
     * @brief Realiza la operación de suma de dos números ingresados por el usuario.
     * @param scanner Objeto Scanner para la entrada del usuario.
     */
    public static void sumar(Scanner scanner) {
        boolean continuar;
        do {
           int[] numeros = IngresarNum.pedirDosEnterosPositivos(scanner);

            int resultado = numeros[0] + numeros[1];
            System.out.println("El resultado de la suma es: " + resultado);

             continuar = Validar.validarContinuar(scanner, "suma");
        } while (continuar);
    }

}
