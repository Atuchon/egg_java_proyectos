//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
package ejer_4;

/**
 *
 * @author ariel
 */

import java.util.Scanner; 

public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los Grados Centigrados");
        double tempC = leer.nextDouble();
        
        double tempF = 32 + (9 * tempC / 5);
        System.out.println("Su temperatura en Grados Fahrenheit es: " + tempF);
        
    }
    
}
