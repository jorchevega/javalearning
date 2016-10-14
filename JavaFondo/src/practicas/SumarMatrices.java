package practicas;
import java.util.Scanner;

/**
 * Practica 24 - Crea dos matrices de 3x3 y suma ambas matrices guardado los 
 * datos en una tercera matriz al final muestra la matriz con la suma.
 * @author escribe tu nombre aqui
 */
public class SumarMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a[][], b[][], suma[][];
        int i,j;
        
        a = new int[3][3];
        b = new int[3][3];
        
        // Leemos los datos
        System.out.println ("Matriz A:");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("A["+i+"]["+j+"]: ");
                a[i][j] = scan.nextInt();
            }
        }
        
        System.out.println ("Matriz B:");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("B["+i+"]["+j+"]: ");
                b[i][j] = scan.nextInt();
            }
        }
        
        // hacemos la suma
        suma = new int[3][3];
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        
        // mostramos los resultado
        System.out.println ("Matriz Suma:");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print (suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}






