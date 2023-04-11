//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

package ejer_2;

/**
 *
 * @author ariel
 */

import java.util.Scanner;

public class Ejer_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner leer = new Scanner(System.in);

System.out.println("Ingrese Su Nombre "); 



String nombre = leer.nextLine();

System.out.println("Tu nombre es: " + nombre);

    
    
    }
    
}
