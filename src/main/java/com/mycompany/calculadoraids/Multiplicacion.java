package com.mycompany.calculadoraids;
import java.util.Scanner;

public class Multiplicacion {

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
