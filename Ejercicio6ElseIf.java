
package eggprojects;

import java.util.Scanner;

public class Ejercicio6ElseIf {
/*Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.*/
    
    public static void main(String[] args) {
        System.out.println("Ingrese dos números enteros");
        Scanner leer = new Scanner(System.in); 
           int num1= leer.nextInt();
            int num2= leer.nextInt();
            
              if (num1 > 25 && num2 > 25) {
               System.out.println("Ambos números son mayores a 25");
                } else {
                 System.out.println("Uno de los números no es mayor a 25");
}  
    }
}
    
    
       
        
        
        
        
    
    

