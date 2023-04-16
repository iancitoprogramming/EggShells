
package eggprojects;

import java.util.Scanner;

public class Ejericio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        int numeroDo = numero*2;
        int numeroTri= numero*3;
        double raizCuadrada = Math.sqrt(numero);
                
        System.out.println("Su doble es: " + numeroDo );
        System.out.println("Su triple es: " + numeroTri);
        System.out.println("Su raíz cuadrada es: " + raizCuadrada);
    }
}
