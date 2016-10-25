/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

/**
 *
 * @author jorge
 */
public class Cadena5a {
    public static void main(String[] args) {
        // Obtengo el milisegundo actual
        long hi = System.currentTimeMillis();
        
        // Insyancio un StringBuffer inicialmente vacio
        StringBuffer sb = new StringBuffer();
        
        // Voy a concatenar n caracteres
        int n = 100000;
        
        char c;
        int b;
        for (int i = 0; i < n; i++) {
            // Obtengo caracteres entre 'A'y 'Z'
            c = (char)('A' + i%('Z'-'A'+1));
            
            // Concateno el caracter con StringBuffer
            sb.append(c);
        }
        
        // Obtengo el milisengundo actual
        long hf = System.currentTimeMillis();
        
        // Muestro la cadena resultante
        System.out.println(sb.toString());
        
        // muestro la cantidad de milisegundos insumidos
        System.out.println((hf-hi) + " milisegundos");
    }
}
