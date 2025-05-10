
package com.mycompany.calculadoraids;
import java.util.Scanner;
/**
 * @brief Clase encargada de solicitar dos enteros positivos al usuario.
 */
public class IngresarNum {
       /**
     * @brief Solicita al usuario dos números enteros positivos.
     * @param scanner Objeto Scanner para la entrada del usuario.
     * @return Un arreglo con los dos enteros positivos ingresados.
     */
    public static int[] pedirDosEnterosPositivos (Scanner scanner) {
        int num1 = Validar.validarEnteroPositivo(scanner);
        int num2 = Validar.validarEnteroPositivo(scanner);
        return new int[] {num1, num2};
    }
}
