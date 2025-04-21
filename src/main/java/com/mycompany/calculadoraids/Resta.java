package com.mycompany.calculadoraids;
import java.util.Scanner;

public class Resta {

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
