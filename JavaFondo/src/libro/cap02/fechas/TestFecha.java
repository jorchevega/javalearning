/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;

/**
 *
 * @author jorge
 */
public class TestFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
        
        // imprimo el dia
        System.out.println("Dia = " + f.getDia());
        
        // imrpimo el mes
        System.out.println("Mes = " + f.getMes());
       
        // imprimo el año
        System.out.println("Año = " + f.getAnio());
        
        // imprimo la fecha
        System.out.println(f);
    }
}
