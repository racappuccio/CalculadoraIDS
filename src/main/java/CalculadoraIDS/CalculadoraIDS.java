package CalculadoraIDS;


import CalculadoraIDS.Multiplicacion;
import CalculadoraIDS.Resta;
import CalculadoraIDS.Suma;
import java.util.Scanner;
public class CalculadoraIDS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("*** CALCULADORA BÁSICA ***");
            System.out.println("[1] – SUMAR.");
            System.out.println("[2] – RESTAR.");
            System.out.println("[3] – MULTIPLICAR.");
            System.out.println("[4] – DIVIDIR.");
            System.out.println("[0] – SALIR DEL PROGRAMA.");
            System.out.print("SELECCIONAR UNA OPCIÓN [0 a 4] Y PRESIONAR ENTER: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entre 0 y 4.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            
            if (opcion < 0 || opcion > 4) {
                System.out.println("Error: Opción inválida. Intente de nuevo.");
            } else {
                switch (opcion) {
                    case 1:
                        Suma.sumar(scanner);
                        break;
                    case 2:
                        Resta.restar(scanner);
                        break;
                    case 3:
                        Multiplicacion.multiplicar(scanner);
                        break;
                    case 4:
                        Division.dividir(scanner);
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                }
            }
        } while (opcion != 0);
    }
}
