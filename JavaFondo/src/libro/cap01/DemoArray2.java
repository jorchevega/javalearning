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
public class DemoArray2 {
    public static void main(String[] args) {
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", 
                        "Sabado", "Domingo"};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un dia de la semana (Numero): ");
        int v = scanner.nextInt();
        
        if(v <= dias.length){
            // recordemos que los arrays se muestran desde 0
            System.out.println( dias[v-1] );
        }
        else{
            System.out.println("Dia incorrecto...");
        }
    }
}
