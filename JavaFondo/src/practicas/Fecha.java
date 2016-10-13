/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

/**
 *
 * @author jorge
 */
public class Fecha {
    // Declaramos los atributos del objeto Fecha
    // privados de tipo entero
    private int dia;
    private int mes;
    private int año;
    
    // creamos los métodos getters y setters para manipular
    // los atributos de tipo del objeto Fecha
    
    // el método setDia asignará un valor al atributo dia del objeto Fecha
    public void setDia(int d){
        this.dia = d;
    }
    
    // el método getDia retornará el valor del atributo dia del objeto Fecha
    public int getDia(){
        return dia;
    }
    
    public void setMes(int m){
        this.mes = m;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setAño(int a){
        this.año = a;
    }
    
    public int getAño(){
        return año;
    }
    
    // Sobreescribimos el método toString para que nos muestre el formato 
    // de la fecha
    public String toString(){
        return dia+"/"+mes+"/"+año;
    }
    
    // Sobreescribimos el método equals para que compare fechas
    public boolean equals(Object o){
        // casteamos la variable o de tipo Object a tipo Fecha
        Fecha otra = (Fecha) o;
        // Comparamos el dia, el mes, y el año de la fecha y retorna true si son
        // iguales o false si son distintos
        return (dia == otra.dia) && (mes == otra.mes) && (año == otra.año);
    }

}
