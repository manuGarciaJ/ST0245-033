/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingUtilities;

/**
 *
 * @author ELO
 */
public class Proyecto_Datos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        long totalSum = 0;
        long startTime = System.currentTimeMillis();
        
        Cuadrado C = new Cuadrado(500,350,500,350);
        QuadTree quad = new QuadTree(C);
 
        
        
        quad.show();
        Drawing d = new Drawing();
        
        ArrayList<Abeja> abejas = createBees();
        for(int i= 0; i< abejas.size();i++){
            quad.insert(abejas.get(i));
        }        
        ArrayList<Abeja> vacio = new ArrayList<>();
        Cuadrado lim = new Cuadrado(250,250,210,210);    
        for(int i= 0; i< abejas.size();i++){
            Abeja ab = abejas.get(i);
            Circulo cir = new Circulo(ab.latitud, ab.longitud, ab.radio * 2);
            ArrayList<Abeja> auxiliar = quad.query(lim,vacio);
        } 
        d.enviar();
        totalSum+= (System.currentTimeMillis()-startTime);
      //System.out.println(totalSum);
        
    }
    
    /**
     *
     * @return
     */
    public static ArrayList createBees(){
        ArrayList<Double> x = new ArrayList<>();
            x.add(-75.544186527);
            x.add(-75.5246358067);
            x.add(-75.5367416928);
            x.add(-75.5618100169);
            x.add(-75.5844313936);
            x.add(-75.5370492275);
            x.add(-75.5626799892);
            x.add(-75.5745726117);
            x.add(-75.5741226112);
            x.add(-75.5241858063);
                    
        ArrayList<Double> y = new ArrayList<>();
            y.add(6.32547929357);
            y.add(6.3394905994);
            y.add(6.33853107083);
            y.add(6.33477179145);
            y.add(6.31232034812);
            y.add(6.33375804797);
            y.add(6.32975464588);
            y.add(6.34463628018);
            y.add(6.34418627973);
            y.add(6.33904059895);
            
        ArrayList<Abeja> retorna = new ArrayList<>();
            
        for(int i= 0;i<y.size();i++){
            int xx = Convert.convertir_x(x.get(i));
            int yy = Convert.convertir_y(y.get(i));
            Abeja aux = new Abeja(xx, yy);           
            retorna.add(aux);
        }
        return retorna;
    }
}
    

