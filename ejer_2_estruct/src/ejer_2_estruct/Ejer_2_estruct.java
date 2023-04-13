/*
 Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.
 */
package ejer_2_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejer_2_estruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese su frase");

    String frase = leer.nextLine();
    
    if (frase.equalsIgnoreCase("eureka")) {
        System.out.println("!Correcto¡");
      }
    else {
       System.out.println("!Incorrecto¡");

    }
        

    }
    
}
