
package ejercicio4;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
                
        String frase;
         
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        
        System.out.println("La frese en mayúsculas es: "+ toUpperCase(frase));
        System.out.println("La frese en minusculas es: "+ toLowerCase(frase));      
    }
}
