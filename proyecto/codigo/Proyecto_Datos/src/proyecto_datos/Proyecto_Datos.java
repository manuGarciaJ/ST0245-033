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
 * @author ELO
 */
public class Proyecto_Datos {
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException { 
        long totalSum = 0;
        long startTime = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();
        
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
                    System.out.println("la abeja en la posicion: " + aux2.latitud + " , " + aux2.longitud 
                            + ". Se va a chocar con la abeja en la posicion: " 
                            + auxiliarAb.latitud + " , " + auxiliarAb.longitud);
                }
            }           
        }        
        d.enviar();
        totalSum+= (System.currentTimeMillis()-startTime);
        System.out.println("EL Tiempo total en ejecutar es "+totalSum);
        long memory = (runtime.totalMemory() - runtime.freeMemory());
        System.out.println("Memoria utilizada en bytes es: " + memory);
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
            Circulo pegado = new Circulo(xx, yy,20);
            Abeja aux = new Abeja(xx, yy, pegado);           
            retorna.add(aux);
        }
        return retorna;
    }
    
    /**
     *
     * @param ruta
     * @return
     */
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
                Abeja temp = new Abeja(xx, yy, pegado);           
                retorna.add(temp);
            }
            }catch(Exception e){
                e.printStackTrace();
            }
        return retorna;
    }

}
    

