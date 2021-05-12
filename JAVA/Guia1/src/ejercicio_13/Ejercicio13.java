package ejercicio_13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int nota;
        
        System.out.println("Ingrese una nota:");
        nota = leer.nextInt();
        
        while (nota<1 || nota>10){
            
            System.out.println("Nota incorrecta, intente nuevamente:");
            nota = leer.nextInt();
        }
        System.out.println("Nota correcta!");
    }
}
