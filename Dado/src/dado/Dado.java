/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author jorch
 */
public class Dado {

    private int noLados;
    private String color;
    private String tamanio;
    
    public void setNoLados(int lados){
        this.noLados = lados;
    }
    
    public int getNoLados(){
        return this.noLados;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setTamanio(String tam){
        this.tamanio = tam;
    }
    
    public String getTamanio(){
        return this.tamanio;
    }
    
    public int lanzar(){
        return (int) (Math.random() * this.noLados) + 1;
    }
    
    public int [] lanzar(int noVeces){
        int[] lanzamientos = new int[noVeces];
        
        for(int i = 0;i < noVeces; i++){
            lanzamientos[i] = lanzar();
        }
        
        return lanzamientos;
    }
    
    public String toString(){
        String cadena = "No. de lados: " + this.noLados + "\nColor: " + this.color + "\nTamaño: " + this.tamanio;
        return cadena;
    }
    
}
