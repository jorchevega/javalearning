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
public class Fecha {
    
    private int dia;
    private int mes;
    private int anio;
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
    
    @Override
    public boolean equals(Object o){
        Fecha otra = (Fecha) o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    // Constructor
    public Fecha(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }
    
    // Constructor sin argumentos
    public Fecha(){
        
    }
    
}
