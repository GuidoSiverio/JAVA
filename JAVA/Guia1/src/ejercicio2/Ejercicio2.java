package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        int num1,num2;
         
        System.out.print("Ingrese el primer numero:"); //con ln hace un salto de linea
        num1 = leer.nextInt();
        
        System.out.print("Ingrese el segundo numero:"); //con ln hace un salto de linea
        num2 = leer.nextInt();
        
        int suma = num1 + num2;
        
        System.out.println("El valor de la suma es: "+ suma);
    }       
}
