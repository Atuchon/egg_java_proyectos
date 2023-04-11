package ejercicio_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
       

Scanner leer = new Scanner(System.in);

System.out.println("Ingrese el primer numero a sumar");

int num_1 = leer.nextInt();

System.out.println("Ingrese el primer numero a sumar");

int num_2 = leer.nextInt();

int suma = num_1 + num_2;

System.out.println("el resultado de la suma es " + suma);

    }
}
