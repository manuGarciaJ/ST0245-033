/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;


import java.awt.*;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Labrador
 */
public class mostrar extends JFrame{
    
    int aux=0;
    static ArrayList<Integer> x = new ArrayList<>();
    static ArrayList<Integer> y = new ArrayList<>();
    static ArrayList<Integer> ancho = new ArrayList<>();
    static ArrayList<Integer> largo = new ArrayList<>();
    
    static ArrayList<Integer> xab = new ArrayList<>();
    static ArrayList<Integer> yab = new ArrayList<>();
    
    static ArrayList<Integer> xabin = new ArrayList<>();
    static ArrayList<Integer> yabin = new ArrayList<>();
    
    
    
    static ArrayList<Integer> circlex = new ArrayList<>();
    static ArrayList<Integer> circley = new ArrayList<>();
    static ArrayList<Integer> circler = new ArrayList<>();
    
    public void paint(Graphics g){
        for(int hey=0; hey<x.size();hey++){
//            if(ancho.get(hey)== 8){continue;}
//            g.setColor(Color.WHITE);
//            g.drawRect(x.get(hey)+10, y.get(hey), ancho.get(hey), largo.get(hey));            
        }
        for(int hey=0; hey<xab.size();hey++){
            g.setColor(Color.RED);
            g.drawRect(xab.get(hey)+10, yab.get(hey), 2, 2);
        }
        for(int hey=0; hey<xabin.size();hey++){
            g.setColor(Color.GREEN);
            g.drawOval(xabin.get(hey)+10, yabin.get(hey), 1, 1);
        }
        for(int aux = 0; aux< circlex.size();aux++){
//            g.setColor(Color.GRAY);
//            g.drawOval(circlex.get(aux)+10, circley.get(aux),circler.get(aux), circler.get(aux));
            
        }
        
    }
    public void access(ArrayList<Integer> x, ArrayList<Integer> y, ArrayList<Integer> ancho, ArrayList<Integer> largo){
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.largo = largo;
    }
    public void accessab(ArrayList<Integer> abx, ArrayList<Integer> aby){
        this.xab = abx;
        this.yab = aby;
    }
    public void accessab1(ArrayList<Integer> abx, ArrayList<Integer> aby){
        this.xabin = abx;
        this.yabin = aby;
    }
    public void accessc(ArrayList<Integer> x, ArrayList<Integer> y,ArrayList<Integer> radio){
        this.circlex = x;
        this.circley = y;
        this.circler = radio;
        
    }
    
    public mostrar(){        
        setBackground(Color.BLACK);
        setSize(new Dimension(1000,700));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
    }
    
    
    
}
