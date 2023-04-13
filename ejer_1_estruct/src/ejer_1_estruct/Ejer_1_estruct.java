/*
Crear un programa que dado un número determine si es par o impar.

 */
package ejer_1_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */



public class Ejer_1_estruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero a verificar");
        int num = leer.nextInt();
        
        
        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
                        System.out.println("El numero es impar");

        }
        
        
        
    }
    
}
