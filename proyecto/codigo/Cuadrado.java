/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import java.util.EnumSet;
import static proyecto_datos.QuadTree.d;

/**
 *
 * @author ELO
 */
public class Cuadrado {
    
    int x;
    int y;
    int ancho;  //weigth    W
    int largo;  //height    H
    
    public Cuadrado(int x, int y, int ancho, int largo){
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.largo = largo;
        d.save(x-ancho,y-largo,ancho*2,largo*2);        
    }
    
    public boolean contains(Abeja abeja){
        return(abeja.latitud >= this.x - this.ancho && 
                abeja.latitud <= this.x + this.ancho &&
                abeja.longitud >= this.y - this.largo &&
                abeja.longitud <= this.y + this.largo);
    }
    
    public boolean intersecta(Cuadrado lim){
        return !(lim.x - lim.ancho > this.x + this.ancho ||
                lim.x + lim.ancho < this.x - this.ancho ||
                lim.y - lim.largo > this.y + this.largo ||
                lim.y + lim.largo < this.y - this.largo);
    }    
}
