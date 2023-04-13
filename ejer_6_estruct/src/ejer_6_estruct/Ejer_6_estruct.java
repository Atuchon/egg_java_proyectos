/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package ejer_6_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejer_6_estruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner(System.in);
    int num_1, num_2,op_menu=0;
    String confirmar;
    
    System.out.println("Ingrese el primer numero");
    num_1 = leer.nextInt();
    System.out.println("Ingrese el segundo numero");
    num_2 = leer.nextInt();
    
    while  (op_menu != 5) {
            System.out.println("\nMENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("5. Salir ");
            System.out.print("\nElige una opción: ");
            op_menu = leer.nextInt();
            
             switch (op_menu) {
                case 1:
                    System.out.println("La suma de " + num_1 + " y " + num_2 + " es " + (num_1 + num_2) );
                    break;
                case 2:
                    System.out.println("La resta de " + num_1 + " y " + num_2 + " es " + (num_1 - num_2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de "  + num_1 + " y " + num_2 + " es " + (num_1 * num_2));
                    break;
                case 4:
                    System.out.println("La división de "  + num_1 + " y " + num_2 + " es " + (num_1 / num_2));
                    break;
                case 5:
                   System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirmar = leer.next();
                    if (confirmar.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo del programa...");
                } else {
                    op_menu=0;
                    }
                    break;
                  
                default:
                    System.out.println("Opción inválida, vuelve a intentarlo.");
                     break;
            
             }
        
    }

    }
}