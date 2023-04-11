/*Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().*/

package ejer_5;

/**
 *
 * @author ariel
 */

import java.util.Scanner; 

public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero entero a procesar");
        double num = leer.nextDouble();
        System.out.println("El doble de su numero es : " + (num * 2));
        System.out.println("El triple de su numero es: "+ (num *3));
        System.out.println("La raiz cuadrada de " + num + " es:  " + Math.sqrt(num) );
    }
    
}
