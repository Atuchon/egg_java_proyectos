/*
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

 */
package ejer_8_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class EJER_8_ESTRUCT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la longitud del lado del cuadrado: ");
        int lon_lado = leer.nextInt();
       
              
        for (int i = 1; i <= lon_lado; i++) {
            for (int j = 1; j <= lon_lado; j++) {
                if (i == 1 || i == lon_lado|| j == 1 || j == lon_lado) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
    
