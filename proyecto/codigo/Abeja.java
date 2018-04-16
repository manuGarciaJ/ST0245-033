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
    double radio;
    
    public Abeja(int latitud, int longitud){
        this.latitud = latitud;
        this.longitud = longitud;
        this.radio = 0.0001;
        d.saveab(latitud, longitud);
    }
    public boolean intersecta(Abeja otra){
        int cat1 = this.latitud - otra.latitud;
        int cat2 = this.longitud - otra.longitud;
        cat1 = cat1*cat1;
        cat2 = cat2*cat2;
        
        int dis = (int) Math.sqrt(cat1 + cat2);
        return dis < this.radio + otra.radio;
    }
}
