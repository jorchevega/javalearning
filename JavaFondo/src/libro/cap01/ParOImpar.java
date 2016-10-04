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

public class ParOImpar {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un valor: ");
        int val = scanner.nextInt();
        
        // Obtenemos el resto de divir val entre 2
        int resto = val % 2;
        
        if(resto == 0){
            System.out.println(val + " es par");
        }
        else{
            System.out.println(val + " es impar");
        }
        
    }
}
