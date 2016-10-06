/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        int t[][];
        boolean simetrica;
        int i,j;
        t = new int[4][4];
        
        for (i=0;i<4;i++){
            for (j=0;j<4;j++){
                System.out.print("Introduzca elemento ["+i+"]["+j+"]: ");
                t[i][j] = leer.nextInt();
            }
        }
        simetrica=true; // suponemos que la matriz es simétrica, y en caso de
        // encontrar un caso donde t[i][j] sea distinta de t[j][i] pondremos
        // simétrica a falso.
        // una solución es mirar todos los elementos de la matriz, pero se hacen comprobaciones
        // dobles, un ejemplo: comprobamos t[1][2] con t[2][1]... pero más tarde comprobaremos
        // t[2][1] con t[1][2]
        // la solución será mirar solo la zona inferior o superior a la diagonal principal.
        // En el momento que tengamos la constancia de que no es simétrica, pararemos
        // todas las comprobaciones
        i=0;
        while(i<4 && simetrica==true){
            j=0;
            while(j<i && simetrica==true){
                if(t[i][j]!=t[j][i])
                    simetrica=false;
                j++;
            }
            i++;
        }
        // si en algún momento se da: t[i][j]!=t[j][i] es que la matriz no es simétrica.
        // si al llegar aquí y la variable simétrica vale true, indica que no hemos encontrado
        // ningún valor que indique que la matriz no es simétrica.
        if(simetrica)
            System.out.println("SIMETRICA");
        else
            System.out.println("NO ES SIMETRICA");
    }
}
