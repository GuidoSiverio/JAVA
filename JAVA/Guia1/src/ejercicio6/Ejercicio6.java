package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        int numero;
        
        System.out.println("Ingrese un numero:");
        numero = leer.nextInt();
        
        System.out.println("Mostrando resultados: doble: "+2*numero+" - triple: "+3*numero+" - raiz cuadrada: "+Math.sqrt(numero));
        
    }
    
}
