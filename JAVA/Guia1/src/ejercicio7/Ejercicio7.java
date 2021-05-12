package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1,num2;
        
        System.out.println("Ingrese 2 numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > num2) {
            System.out.println("El numero mayor es: "+num1);
        }else if(num2 > num1) {
            System.out.println("El numero mayor es: "+num2);
        }else{
            System.out.println("Los numero son iguales");
        }
    }
}
