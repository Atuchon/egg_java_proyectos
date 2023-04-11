//Escribir un programa que pida una frase y la muestre toda en mayúsculas 
//y después toda en minúsculas.
package ejer_3;

/**
 *
 * @author ariel
 */

import java.util.Scanner; 


public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese Su frase");
        String frase = leer.nextLine();
        
        System.out.println("Su frase en minusculas es:" + frase.toLowerCase());
        System.out.println("Su frase en mayusculas es:" + frase.toUpperCase());
    
    }
    
}
