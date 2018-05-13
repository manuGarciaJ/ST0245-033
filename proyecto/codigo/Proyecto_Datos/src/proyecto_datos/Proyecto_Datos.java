/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Isaias Labrador Sanchez && Manuel Eduardo Garcia Jimenez
 */
public class Proyecto_Datos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException { 
        long totalSum = 0;
        long startTime = System.currentTimeMillis();
        
        Cuadrado C = new Cuadrado(500,350,500,350);
        QuadTree quad = new QuadTree(C);        
        
        Drawing d = new Drawing();
        
        ArrayList<Abeja> abejas =leer(".\\src\\proyecto_datos\\ConjuntoDeDatosCon1000abejas.txt");
        
        //arraylist vacio para mandar a la funcion query
        ArrayList<Abeja> auxiliar = new ArrayList<>();        
        ArrayList<Abeja> otra = new ArrayList<>();
        
        for(int i= 0; i< abejas.size();i++){
            Abeja auxiliarAb = abejas.get(i);
            quad.insert(auxiliarAb);

            // x y y del limite para pasar al query
            int x = abejas.get(i).latitud;
            int y = abejas.get(i).longitud;
            
            Circulo a = new Circulo(auxiliarAb.latitud,auxiliarAb.longitud, (int)auxiliarAb.comparar.radio*2);
            otra = quad.query(a, auxiliar);
            for(int j = 0; j <otra.size();j++){
                Abeja aux2 = otra.get(j);
                if(auxiliarAb != aux2 && auxiliarAb.intersecta(aux2)){
                    System.out.println("la abeja en la posicion: " + aux2.auxLatitud + " , " + aux2.auxLongitud 
                            + ". Se va a chocar con la abeja en la posicion: " 
                            + auxiliarAb.auxLatitud + " , " + auxiliarAb.auxLongitud);
                }
            }           
        }        
        d.enviar();
        totalSum+= (System.currentTimeMillis()-startTime);
        System.out.println(totalSum);
        
    }

    
    public static ArrayList leer(String ruta){
        ArrayList<Abeja> retorna = new ArrayList<>();
        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            String ayudante;
            while((ayudante=lector.readLine()) != null){   
                if(ayudante.equals("Coordenada x de la abeja, coordenada y de la abeja")){continue;}
                String [] valores = ayudante.split(",");
                int xx = Convert.convertir_x(Double.parseDouble(valores[0]));
                int yy = Convert.convertir_y(Double.parseDouble(valores[1])); 
                Circulo pegado = new Circulo(xx, yy,20);
                Abeja temp = new Abeja(xx, yy, pegado, Double.parseDouble(valores[0]), Double.parseDouble(valores[1]));           
                retorna.add(temp);
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        return retorna;
    }

}
    

