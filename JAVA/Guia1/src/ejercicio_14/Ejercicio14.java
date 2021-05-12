package ejercicio_14;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int limite,num,suma = 0;
        
        System.out.println("Ingrese un limite:");
        limite = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero para la suma");
            num = leer.nextInt();
            suma += num;
        } while (suma <= limite);
        System.out.println("Se supero el limite");
    }
    
}