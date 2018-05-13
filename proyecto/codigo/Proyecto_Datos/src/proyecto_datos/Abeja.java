/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;
import static proyecto_datos.QuadTree.d;
/**
 *
 * @author ELO
 */
public class Abeja {
    int latitud;    // eje x
    int longitud;   // eje y
    Circulo comparar;
    
    /**
     * @author Isaias Labrador Sánchez 
     * @param latitud
     * @param longitud
     * @param comparar 
     */
    public Abeja(int latitud, int longitud, Circulo comparar){
        this.latitud = latitud;
        this.longitud = longitud;
        this.comparar = comparar;
        d.saveab(latitud, longitud);
        
    }
    /**
     * 
     * @param otra
     * @return Si la abeja sobre la que se aplica el metodo se intersecta con la abeja
     * que se pasa como parametro
     */
    public boolean intersecta(Abeja otra){
        int cat1 = this.latitud - otra.latitud;
        int cat2 = this.longitud - otra.longitud;
        cat1 = cat1*cat1;
        cat2 = cat2*cat2;
        
        int dist = (int) Math.sqrt(cat1 + cat2);
        return dist < this.comparar.radio + otra.comparar.radio;
    }
}
