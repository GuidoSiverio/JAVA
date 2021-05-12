package ejercicio_16;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int num = 0,suma = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el numero "+(i+1)+":");
            num = leer.nextInt();
            if (num>0) {
                suma += num;
            }else if(num == 0){
                break;
            }
        }
        
        if (num == 0) {
            System.out.println("Se capturó el numero cero");
            
        }else{
            System.out.println("La suma es: "+suma);
        }
    }
    
}
