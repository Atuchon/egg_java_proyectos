/*Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y determine
si ambos o alguno de ellos es mayor a 25.*/

package ejer_6_teor;

/**
 *
 * @author ariel
 */

import java.util.Scanner; 



public class Ejer_6_teor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
            
        System.out.println("debe ingresar dos numeros enteros");
        System.out.println("Ingrese el primer numero");
        int num_1 = leer.nextInt();
        System.out.println("Ingrese el segundo  numero");
        int num_2 = leer.nextInt();
        
        if ((num_2  > 25) && (num_1  > 25))   {
            System.out.println("Ha ingresado  ambos numeros mayores a 25");
    }   else if ((num_2  > 25) ||(num_1  > 25)) {
        System.out.println("Ha ingresado un numero mayor a 25");
    }  
        else {
            System.out.println("ambos numeros son menores de 25");
        }    

        }


        
    }
    

