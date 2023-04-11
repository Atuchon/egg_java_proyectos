/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ariel
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.*/
// TODO code application logic here

 String nombre = "Giulia";
 String apellido = "carandina";
 char letra = 'a';
 boolean resul = nombre.contains("u"); 
 int edad = 27;
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Mi edad es: " + edad);

        System.out.println(resul);

           
    }

}