
package eggprojects;

import java.util.Scanner;

/*. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        int celcius = leer.nextInt();
        int fahrenheit = 32 + (9 * celcius / 5);
        System.out.println("Su equivalencia en Fahrenheit es de: " + fahrenheit );
        
    }
    
}
