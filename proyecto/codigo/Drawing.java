/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Labrador
 */
public class Drawing{
    static int aux = 0;
    static ArrayList<Integer> x = new ArrayList<>();
    static ArrayList<Integer> y = new ArrayList<>();
    static ArrayList<Integer> ancho = new ArrayList<>();
    static ArrayList<Integer> largo = new ArrayList<>();
    static ArrayList<Integer> xab = new ArrayList<>();
    static ArrayList<Integer> yab = new ArrayList<>();
    
    static ArrayList<Integer> xabin = new ArrayList<>();
    static ArrayList<Integer> yabin = new ArrayList<>();
    
    public void save(int x, int y, int ancho, int largo){        
        this.x.add(x);
        this.y.add(y);
        this.ancho.add(ancho);
        this.largo.add(largo);
        this.aux++;        
    }
    public void enviar(){
        mostrar m = new mostrar();
        m.access(x, y, ancho, largo);
        m.accessab(xab, yab);
        m.accessab1(xabin, yabin);
    }
    public void saveab(int x, int y){
        if(yab.contains(y)|| xab.contains(x)){return;}
        else{
        this.yab.add(y);
        this.xab.add(x);
        this.aux++;
        }
    }
    public void saveab1(int x, int y){
        if(yabin.contains(y)|| xabin.contains(x)){return;}
        else{
            this.yabin.add(y);
            this.xabin.add(x);
            this.aux++;
        }
}}
