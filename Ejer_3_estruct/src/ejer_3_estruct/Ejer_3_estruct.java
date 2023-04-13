/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
package ejer_3_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejer_3_estruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);        
    System.out.println("Ingrese su frase");
    String frase = leer.nextLine();
    
    if (frase.length()== 8) {
         System.out.println("CORRECTO");
          }
    else {
            System.out.println("INCORRECTO");

        
    }
    
    }
}
