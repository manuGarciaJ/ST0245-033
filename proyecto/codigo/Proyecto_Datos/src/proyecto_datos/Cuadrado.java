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


//  La mayoria del codigo de la clase de Cuadrado
//  Fue obtenida a traves de internet (Youtube), pero fue modificada por
//  Isaias Labrador Sanchez && Manuel Eduardo Garcia Jimenez 
//  Para alcanzar el proposito del programa.
//
//  Title: Coding Challenge #98.1: Quadtree
//  Author: The Coding Train (Youtube Channel)
//  Date: 2018
//  Code version: Unknown
//  Availability: https://www.youtube.com/watch?v=OJxEcs0w_kE && https://www.youtube.com/watch?v=QQx_NmCIuCY&t=172s
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
////        d.save(x-ancho,y-largo,ancho*2,largo*2);        
    }
    
    /**
     * 
     * @param abeja
     * @return si dentro del cuadrado en cuestion se encuentra la abeja que se pasa como parametro
     */
    public boolean contains(Abeja abeja){
        return(abeja.latitud >= this.x - this.ancho && 
                abeja.latitud <= this.x + this.ancho &&
                abeja.longitud >= this.y - this.largo &&
                abeja.longitud <= this.y + this.largo);
    }
    /**
     * 
     * @param lim
     * @return Si el cuadrado en cuestion se intersecta con el cuadrado de parametro 
     */
    public boolean intersecta(Cuadrado lim){
        return !(lim.x - lim.ancho > this.x + this.ancho ||
                lim.x + lim.ancho < this.x - this.ancho ||
                lim.y - lim.largo > this.y + this.largo ||
                lim.y + lim.largo < this.y - this.largo);
    }
    /**
     * 
     * @param lim
     * @return Si el cuadrado en cuestion se intersecta con el Circulo de parametro 
     */
    public boolean intersecta(Circulo lim){
        return !(lim.x - lim.radio > this.x + this.ancho ||
                lim.x + lim.radio < this.x - this.ancho ||
                lim.y - lim.radio > this.y + this.largo ||
                lim.y + lim.radio < this.y - this.largo);
    }
}
