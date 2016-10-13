package practicas;
import java.util.Scanner;

/**
 * Practica 25 - Transponer una matriz de 3x3, es decir, cambiar sus filas a 
 * columnas.
 * @author escribe tu nombre aqui
 */
public class TransponerMatriz {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Delcaramos una matriz y llenamos con numeros
        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Ingrese el elemento ["+i+"]["+j+"]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        // mostramos la matriz original
        System.out.println("Matriz original");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Transponemos la matriz y guardamos los datos en matrizT
        int matrizT[][] = new int[3][3];
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        
        // Mostramos la matriz Transpuesta
        System.out.println("------------------");
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                System.out.print(matrizT[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



