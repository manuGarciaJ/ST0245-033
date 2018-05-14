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
import static proyecto_datos.QuadTree.d;
//
//  La mayoria del codigo de la clase de Circulo
//  Fue obtenida a traves de internet (Youtube), pero fue modificada por
//  Isaias Labrador Sanchez && Manuel Eduardo Garcia Jimenez 
//  Para alcanzar el proposito del programa.
//
//  Title: Coding Challenge #98.1: Quadtree
//  Author: The Coding Train (Youtube Channel)
//  Date: 2018
//  Code version: Unknown
//  Availability: https://www.youtube.com/watch?v=OJxEcs0w_kE && https://www.youtube.com/watch?v=QQx_NmCIuCY&t=172s

public class Circulo {
    int x;
    int y;
    double radio;
    /**
     * Constructor Circulo, sirve de referencia para el rango de +- 100 metro
     * @param x - x del centro del circulo que se crea
     * @param y - y del centro del circulo que se crea
     * @param r - radio del circulo que se crea
     */
    public Circulo(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.radio = r/2;
        d.savecir(x, y, r);
        
    }

    /**
     * 
     * @param lim - Cuadrado con el que se compara si intersecta
     * @return Si el circulo con al que se le aplica se intersecta con el que se pasa como parametro 
     */
    public boolean intersecta(Cuadrado lim){
        // Se  extrae la distancia en X y Y restandolas entre si
        int xdis = Math.abs(lim.x - this.x);
        int ydis = Math.abs(lim.x - this.x);
        
        //Radio sobre el circulo que se aplica
        double rd = this.radio;
        //ancho y largo del cuadrado que obtiene
        int ancho = lim.ancho;
        int largo = lim.largo;
        
        // Se hace el calculo de distancias por medio de pitagoras
        double aux = xdis -  ancho;   aux = aux*aux;
        double aux2 = ydis - largo;   aux2 = aux2 * aux2;
        double bordes = aux + aux2;
        // Si la distancia es mayor al radio...
        if(xdis > (rd + ancho) || ydis > (rd + largo)){
            return false;
        }
        //...si es menor o igual
        if(xdis <= ancho || ydis <= largo){
            return true;
        }
        // Si la distancia por pitagoras es menor o igual al radio elevado al cuadrado
        return bordes <= (this.radio * this.radio);
    }
    /**
     * 
     * @param abeja - Abeja sobre la que se pregunta si el circulo la "contiene"
     * @return si el circulo con su X y Y espeficidado contiene la abeja que se pasa como parametro
     */
    public boolean contains(Abeja abeja){
        // Como el circulo es un rango adherido a una abeja se descarta que
        // diga que el rango de mi abeja contiene a mi abeja
        if(abeja.latitud == this.x && abeja.longitud == this.y){return false;}
        
        //´se calcula distancia por pitagoras
        int x = abeja.latitud - this.x;
        int y = abeja.longitud - this.y;
        x = x*x;
        y = y*y;
       
        return (x+y)<= (this.radio*this.radio);
    }
}
