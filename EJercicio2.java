package eggprojects;

import java.util.Scanner;

public class EJercicio2 {
    /*   Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=leer.next(); 
        System.out.println(nombre);
    }
    
}
