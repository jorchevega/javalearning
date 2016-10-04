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

public class DemoSwitch {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un dia de la semana (numero): ");
        int val = scanner.nextInt();
        
        String dia;
        
        switch(val){
            case 1:
                dia = "Lunes";
            break;
            case 2:
                dia = "Martes";
            break;
            case 3:
                dia = "Miercoles";
            break;
            case 4:
                dia = "Jueves";
            break;
            case 5:
                dia = "Viernes";
            break;
            case 6:
                dia = "Sabado";
            break;
            case 7:
                dia = "Domingo";
            break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7";
            break;
        }
        
        System.out.println(dia);
    }
    
    
    
}
