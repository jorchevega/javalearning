/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

/**
 *
 * @author jorch
 */

import java.util.Scanner;

public class ParOImpar2 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor: ");
        int val = scanner.nextInt();
        
        // obtenemos el resto de dividir val por 2
        int resto = val % 2;
        
        // utilizamos un if in-line 
        String mssg = (resto == 0) ? "es par" : "es impar";
        
        // muestro el resultado
        System.out.println(val + " " + mssg);
        
    }
    
}
