/*
 Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package ejer_8_teor;

/**
 *
 * @author ariel
 */

import java.util.Scanner; 

public class Ejer_8_teor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la Nota");
        int nota = leer.nextInt();
        
        while (nota > 10 || nota <0){
        System.out.println("Ingrese la Nota");
    	nota = leer.nextInt();
    }
        
    }
    
}
