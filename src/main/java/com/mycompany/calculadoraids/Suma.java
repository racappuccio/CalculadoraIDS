package com.mycompany.calculadoraids;
import java.util.Scanner;

public class Suma {

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
