package practicas;
import java.util.Scanner;

/**
 * Practica 26 - Crea una matriz de 3x3 llena de datos la matriz y comprueba si 
 * la matriz es simatrica o no
 * @author escribe tu nombre aqui
 */

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        int t[][];
        boolean simetrica;
        int i,j;
        t = new int[3][3];
        
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print("Introduzca elemento ["+i+"]["+j+"]: ");
                t[i][j] = leer.nextInt();
            }
        }
        simetrica=true; // suponemos que la matriz es simétrica
                        // el algoritmo de abajo se encargará de comprobar
                        // si la matriz es simetrica en caso de no ser asi
                        // cambiara el valor de simetrica a false
        i = 0;
        while(i<3 && simetrica==true){
            j = 0;
            while(j<i && simetrica==true){
                if(t[i][j]!=t[j][i])
                    simetrica=false;
                j++;
            }
            i++;
        }
        
        // si en algún momento se da: t[i][j]!=t[j][i] es que la matriz 
        //no es simétrica.
        // si al llegar aquí y la variable simétrica vale true, indica que no 
        // hemos encontrado ningún valor que indique que la matriz no es simétrica.
        if(simetrica)
            System.out.println("SIMETRICA");
        else
            System.out.println("NO ES SIMETRICA");
    }
}
