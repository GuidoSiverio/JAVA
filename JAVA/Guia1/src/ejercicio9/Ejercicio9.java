package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}