/*
 Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package ejer_10_teor;

/**
 *
 * @author ariel
 */

import java.util.Scanner;

public class ejer_10_teor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numero;
        String salida = "";

        // Leer y procesar cada número
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese el número " + i + " (entre 1 y 20): ");
            numero = sc.nextInt();

            // Verificar que el número esté en el rango correcto
            while (numero < 1 || numero > 20) {
                System.out.print("Número fuera de rango. Ingrese un número entre 1 y 20: ");
                numero = sc.nextInt();
            }

            // Agregar los asteriscos a la salida
            salida += numero + ": ";
            for (int j = 0; j < numero; j++) {
                salida += "*";
            }
            salida += "\n";
        }

        // Imprimir los números y asteriscos juntos
        System.out.println("Números y asteriscos:");
        System.out.println(salida);
    }
}