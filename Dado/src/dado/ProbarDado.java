/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;
import java.util.Scanner;
/**
 *
 * @author jorch
 */
public class ProbarDado {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Dado dado1 = new Dado();
        System.out.print("Cualtos lados tiene? ");
        int lados = leer.nextInt();
        System.out.print("De que color es? ");
        String color = leer.next();
        System.out.print("De que tamaño es? ");
        String tam = leer.next();
        System.out.print("Cuantas veces quieres lanzar el dado? ");
        int lanzarN = leer.nextInt();
        
        
        
        dado1.setNoLados(lados);
        dado1.setColor(color);
        dado1.setTamanio(tam);
        int[] lanzamientos = dado1.lanzar(lanzarN);
        
        
        
        
        
        System.out.println("\nMostrando el dado");
        System.out.println(dado1);
        
        System.out.println("\nResultado de los lanzamentos");
        for(int i = 0; i < lanzamientos.length; i++){
            System.out.println("Lanzamiento " + (i+1) + ": " + lanzamientos[i]);
        }
        
        
        
    }
}
