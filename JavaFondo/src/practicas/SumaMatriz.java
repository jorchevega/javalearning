/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;
import java.util.Scanner;
/**
 *
 * @author jorch
 */
public class SumaMatriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Sumar las filas y columnas de una matriz");
        System.out.println("========================================");
        
        System.out.print("Ingresa el numero de filas: ");
        int fil = leer.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        int col = leer.nextInt();
        
        System.out.println("\nSe ha creado una matriz nueva");
        int matriz[][] = new int[fil+1][col+1];
        System.out.println("Numero de filas: " + matriz.length);
        System.out.println("Numero de columnas: " + matriz[0].length);
        
        System.out.println("\nLlenar la matriz con los elementos");
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Elemento ["+i+"]["+j+"]: ");
                matriz[i][j] = leer.nextInt();
                matriz[i][col] = matriz[i][col] + matriz[i][j];
                matriz[fil][j] = matriz[fil][j] + matriz[i][j];
            }
        }
        
        System.out.println("\nMostrando la matriz con la suma de sus filas y columnas\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(!(i == fil && j == col))
                    System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
