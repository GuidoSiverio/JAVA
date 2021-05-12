
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int grados;
        
        System.out.println("Ingrese un valor de grados: ");
        grados = leer.nextInt();
        
        System.out.println("Los grados en farenheit son: "+ (32+(9*grados/5)));
        
    }
    
}
