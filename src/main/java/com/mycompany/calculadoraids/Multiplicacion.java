package com.mycompany.calculadoraids;
import java.util.Scanner;

/**
 * @brief Clase que contiene la operación de multiplicación.
 */
public class Multiplicacion {
 /**
     * @brief Realiza la operación de multiplicación entre dos números ingresados por el usuario.
     * @param scanner Objeto Scanner para la entrada del usuario.
     */
    public static void multiplicar(Scanner scanner) {
        boolean continuar;
        do {
            int[] numeros = IngresarNum.pedirDosEnterosPositivos(scanner);

            int resultado = numeros[0] * numeros[1];
            System.out.println("El resultado de la multiplicación es: " + resultado);

            continuar = Validar.validarContinuar(scanner, "multiplicación");
        } while (continuar);
    }

}
