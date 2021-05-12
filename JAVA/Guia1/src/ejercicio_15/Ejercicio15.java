package ejercicio_15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        double num1,num2;
        int opcion;
        String letra;
        
        System.out.println("Ingrese 2 numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("Menu"
                + "\n1.Sumar"
                + "\n2.Restar"
                + "\n3.Mutiplicar"
                + "\n4.Dividir"
                + "\n5.Salir"
                + "\nElija una opción:");
            opcion = leer.nextInt();
        
            switch (opcion){
                case 1:
                    System.out.println("La suma es: "+ (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+ (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: "+ (num1*num2));
                    break;
                case 4:
                    System.out.println("La división es: "+ (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa(S/N)?");
                    letra = leer.next();
                    if (letra.equals("N") || letra.equals("n")){
                        opcion = 1;
                    }

                default: 
                    break;
            }
        } while (opcion != 5);
        
    }
    
}
