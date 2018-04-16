/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import java.util.ArrayList;
import java.util.EnumSet;
import jdk.nashorn.internal.codegen.CompilerConstants;


/**
 *
 * @author ELO
 */
public class QuadTree {
    
    int inicial = 0;
    
    Cuadrado limite;
    int capacidad;
    ArrayList<Abeja>abejas;
    boolean dividido;
    
    QuadTree no;
    QuadTree ne;
    QuadTree so;
    QuadTree se;
    
    
    
    static Drawing d = new Drawing();
    
    public QuadTree(Cuadrado limite){
        this.limite = limite;
        this.capacidad = 1;
        abejas = new ArrayList<>();
        this.dividido = false;
    }
    
    private void insertBee(Abeja abeja){
        if(!this.limite.contains(abeja)){
            return;
        }
        if(this.abejas.size() < this.capacidad){            
            this.abejas.add(abeja);
        }else{
            if(!(this.dividido)){
                this.dividir();
            }
            if(this.abejas.size()> 0 && this.inicial == 0){
            this.no.insert(this.abejas.get(0));
            this.ne.insert(this.abejas.get(0));
            this.so.insert(this.abejas.get(0));
            this.se.insert(this.abejas.get(0));
            }
            this.no.insert(abeja);
            this.ne.insert(abeja);
            this.so.insert(abeja);
            this.se.insert(abeja);
            inicial++;
                        
        }
    }
    
    public void insert(Abeja a){
        insertBee(a);
    }
    
    private void dividir(){
        int x = this.limite.x;
        int y = this.limite.y;
        int ancho = this.limite.ancho;
        int largo = this.limite.largo;
        
            // CUADRADO ( X  --- Y --- ANCHO --- LARGO ) 
        
        Cuadrado no = new Cuadrado(x - (ancho/2),y - (largo/2), ancho/2, largo/2);
        Cuadrado ne = new Cuadrado((x + (ancho/2)),(y - (largo/2)),ancho/2, largo/2);
        Cuadrado so = new Cuadrado(x - (ancho/2),(y + (largo/2)), ancho/2, largo/2);
        Cuadrado se = new Cuadrado(x + (ancho/2), (y + (largo/2)), ancho/2, largo/2);
        
        this.no = new QuadTree(no); 
        this.ne = new QuadTree(ne);
        this.so = new QuadTree(so);
        this.se = new QuadTree(se);
        this.dividido = true;
    }
    
    public ArrayList query(Cuadrado lim, ArrayList ab_encontradas){
        if(!this.limite.intersecta(lim)){
            return null;
        }else{
            for(int i = 0; i < this.abejas.size(); i++){
                if(lim.contains(this.abejas.get(i))){
                    if(ab_encontradas.contains(this.abejas.get(i))){
                        continue;
                    }else{
                    ab_encontradas.add(this.abejas.get(i));
                    }
                }
            }
            if(this.dividido){
                this.ne.query(lim, ab_encontradas);
                this.no.query(lim, ab_encontradas);
                this.se.query(lim, ab_encontradas);
                this.so.query(lim, ab_encontradas);
            }
        }
        return ab_encontradas;
    }
    
    public void show(){         
        if(this.dividido){
            this.no.show();
            this.ne.show();
            this.se.show();
            this.so.show();            
        }  
    }
            
}
