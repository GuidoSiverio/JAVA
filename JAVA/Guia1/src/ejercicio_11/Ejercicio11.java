package ejercicio_11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String frase;
        
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        
        String primeraLetra = frase.substring(0, 0);
        
        if (primeraLetra.equals("A")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}