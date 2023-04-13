/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.

 */
package ejer_5_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class EJER_5_ESTRUCT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);    
               System.out.println("INGRESE SU NUMERO LIMITE");
               int num_limite = leer.nextInt();
               int suma = 0;
               int num_ing ;
               
               do {            
                   System.out.println("Ingrese su numero a sumar");
                   num_ing = leer.nextInt();
                   suma += num_ing; 
   
    } while (suma <=num_limite);
               System.out.println("La suma de los numeros ingresados supera el limite: " + num_limite + " La suma es: " + suma);
               
               
    }
}
