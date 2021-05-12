package ejercicio1;

import java.util.Scanner;

/*
package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);


    }
    
}*/

public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        int numero = 0;
        double decimal = 0.0;
        
        String cadena = "";
        char caracter = ' ';
        
        boolean logic = false; 
        
        //Entero
        
        System.out.println("Ingrese un numero:"); //con ln hace un salto de linea
        
        numero = leer.nextInt();
        
        int mult = numero*2;
        
        System.out.println("El numero ingresado es: "+ numero);
        System.out.println("El doble es: "+ mult);
        
        //Decimal
        
        System.out.println("Ingrese un decimal:"); //con ln hace un salto de linea
        
        decimal = leer.nextDouble();
        
        double multDecimal = decimal*2;
        
        System.out.println("El numero ingresado es: "+ decimal);
        System.out.println("El doble es: "+ multDecimal);
        
        
        //Cadenas
        
        System.out.println("Ingrese una cadena:");
        cadena = leer.next();
        
        String cadena1 = leer.next();
        
        System.out.println("La cadena ingresada es: "+ cadena);
        System.out.println("La cadena mas cadena1 es: "+ cadena + " " + cadena1);    }
    
}