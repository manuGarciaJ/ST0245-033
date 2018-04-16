/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

/**
 *
 * @author Labrador
 */
public class Circulo {
    int x;
    int y;
    double r;
    
    public Circulo(int x, int y, double r){
        this.x = x;
        this.y = y;
        this.r = r; 
    }
    public boolean intersecta(Cuadrado lim){
        int xdis = Math.abs(lim.x - this.x);
        int ydis = Math.abs(lim.x - this.x);
        
        double r = this.r;
        
        int ancho = lim.ancho;
        int largo = lim.largo;
        
        return true;
        
        
    }
    
    public boolean contains(Abeja abeja){
        int x = abeja.latitud - this.x;
        int y = abeja.longitud - this.y;
        x = x*x;
        y = y*y;
        
        return (x+y)<= (this.r*this.r);
    }
}
