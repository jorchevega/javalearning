/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Cadena6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        int v = scan.nextInt();
        
        System.out.println("Valor ingresado: " + v);
        System.out.println("binario = " + Integer.toBinaryString(v));
        System.out.println("octal = " + Integer.toOctalString(v));
        System.out.println("hexadecimal " + Integer.toHexString(v));
        
        System.out.print("Ingrese una base numerica: ");
        int b = scan.nextInt();
        
        String sBaseN = Integer.toString(v,b);
        System.out.println(v + " en base ("+b+") = " + sBaseN);
    }
}
