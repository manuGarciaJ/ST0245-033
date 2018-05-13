/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import java.util.ArrayList;
import java.util.EnumSet;


/**
 *
 * @author ELO
 */
public class QuadTree {
    
    int inicial = 0;
    //zona de dominio de mi Quadtree
    Cuadrado limite;
    int capacidad;
    ArrayList<Abeja>abejas;
    boolean dividido;
    
    QuadTree no;
    QuadTree ne;
    QuadTree so;
    QuadTree se;
    
    
    
    static Drawing d = new Drawing();
    /**
     * Constructor de cada QuadTree
     * @param limite 
     */
    public QuadTree(Cuadrado limite){
        this.limite = limite;
        this.capacidad = 4;
        abejas = new ArrayList<>();
        this.dividido = false;
    }
    
    /**
     * Funcion principal que inserta las abejas en el arbol
     * @param abeja 
     */
    private void insertBee(Abeja abeja){
        // si mi zona de dominio no contiene la abeja se sale de la recursion
        // para mas detalles @see Cuadrado.contains(Abeja)
        if(!this.limite.contains(abeja)){
            return;
        }
        // como cada QuadTree tiene una capacidad, si mi Quadtree no ha
        // desbordado mi capacidad añade la abeja a mi dominio
        if(this.abejas.size() < this.capacidad){            
            this.abejas.add(abeja);
        }else{
            // Si este Quadtree no esta divido, lo divido para insertar la abeja 
            // sin desbordar la capacidad
            if(!(this.dividido)){
                this.dividir();
            }
            // Como el quadtree se dividio quiere decir que toca meter 
            // las abejas que ya estaban añadidas a la zona que le corresponde
            // como la capacidad es solo 1 solo se hace un get
            if(this.abejas.size()> 0 && this.inicial == 0){
                
                for(int i = 0;i<this.abejas.size();i++){
                    this.no.insert(this.abejas.get(i));
                    this.ne.insert(this.abejas.get(i));
                    this.so.insert(this.abejas.get(i));
                    this.se.insert(this.abejas.get(i));
                }
//            this.no.insert(this.abejas.get(0));
//            this.ne.insert(this.abejas.get(0));
//            this.so.insert(this.abejas.get(0));
//            this.se.insert(this.abejas.get(0));
            }
            // se inserta la abeja recursivamente, el programa descarta aqellas que 
            // no pertenecen a el dominio del QuadTree, de ahi sale la rapidez
            // en su calculo
            this.no.insert(abeja);
            this.ne.insert(abeja);
            this.so.insert(abeja);
            this.se.insert(abeja);
            inicial++;
                        
        }
    }
    /**
     * Funcion publica auxiliar de InsertBee
     * @param a 
     */
    public void insert(Abeja a){
        insertBee(a);
    }
    
    /**
     * Funcion que divide el Quadtree en 4 zonas con misma dimension
     * y las añade a los atributos, siendo 
     *  NorEste
     *  NorOeste
     *  SurEste
     *  SurOeste
     */
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
    /**
     * Funcion que a traves de un rango o limite dado, me devuelve las abejas
     * que esten dentro del mismo
     * @param lim
     * @param ab_encontradas
     * @return 
     */
    public ArrayList query(Circulo lim, ArrayList ab_encontradas){
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
    /**
     * Funcion para mostrar en ventana con Graphics2D
     */
    public void show(){         
        if(this.dividido){
            this.no.show();
            this.ne.show();
            this.se.show();
            this.so.show();            
        }  
    }
            
}
