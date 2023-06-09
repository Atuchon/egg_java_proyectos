/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá
investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package ejer_7_estruct;

import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class Ejer_7_estruct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Scanner leer = new Scanner(System.in); 
     int correcta=0, incorrecta=0;
     String FDE = "&&&&&";
    
     do {
     
     System.out.println("Ingrese su secuencia");
     String cadena = leer.nextLine();
     
     if (cadena.equals("&&&&&")) {
         System.out.println("Secuencia de fin");
                break;}
     
     if (cadena.length()== 5 && cadena.substring(0,1).equals("X") && cadena.substring(4).equals("O") ) {
         System.out.println("SECUENCIA CORRECTA");
         correcta++; }
     
        else   {
             System.out.println("SECUENCIA INCORRECTA");
        incorrecta++;        }
  } while (true);
     
          System.out.println("INFORME");
          System.out.println("CANTIDAD DE SECUENCIAS CORRECTAS: " + correcta);
          System.out.println("CANTIDAD DE SECUENCIAS INCORRECTAS: " + incorrecta);
         
     }
     }

    
     
    

