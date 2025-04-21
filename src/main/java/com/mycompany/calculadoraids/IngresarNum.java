
package com.mycompany.calculadoraids;
import java.util.Scanner;
public class IngresarNum {
    public static int[] pedirDosEnterosPositivos (Scanner scanner) {
        int num1 = Validar.validarEnteroPositivo(scanner);
        int num2 = Validar.validarEnteroPositivo(scanner);
        return new int[] {num1, num2};
    }
}
