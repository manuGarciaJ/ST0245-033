/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres;

import java.util.ArrayList;

/**
 *
 * @author Isaias labrador Sanchez 
 */
public class Fecha{
    
    int dia;
    int mes;
    int anio;
    
    public Fecha(int dia, int mes, int anio){
    
        if(dia>31|| mes>12 || anio>2018){
            System.out.println();
        }else{
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;        
        }
    }
    
    /**
     * @return Dia del objeto fecha
     */
    public int getDia(){
        return this.dia;
    }
    /**
     * @return Mes del objeto fecha 
     */
    public int getMes(){
        return this.mes;
    }
    /**
     * @return Año del objeto fecha
     */
    public int getAnio(){
        return this.anio;
    }
   
    
    /**
     * El metodo escribe en consola las fechas en orden de mas antigua a mas reciente 
     * Comparando las fechas del arraylist
     */
    public static void toString(Fecha f){
        System.out.println(f.getDia() + " / " + f.getMes() + " / " + f.getAnio());        
    }
    
    
    /**
     * 
     * @param fecha1
     * @param fecha2
     * @return verdadero en caso de que sean iguales o falso de lo contrario 
     */
    public static boolean comparar_igualdad(Fecha fecha1, Fecha fecha2){
        
        int dia1= fecha1.getDia();
        int mes1= fecha1.getMes();
        int anio1= fecha1.getAnio();
        
        int dia2 = fecha2.getDia();
        int mes2 = fecha2.getMes();
        int anio2 = fecha2.getAnio();
        
        
        if(dia1 == dia2 && mes1 == mes2 && anio1 == anio2){
            return true; 
        }else{
            return false;
        }
        
    }    
    /**
     * El metodo me compara si ambas fechas si una es mayor a otra, menor o iguales
     * @param fecha1
     * @param fecha2 
     */
    public static void comparar(Fecha fecha1, Fecha fecha2){
        int dia1= fecha1.getDia();
        int mes1= fecha1.getMes();
        int anio1= fecha1.getAnio();
        
        int dia2 = fecha2.getDia();
        int mes2 = fecha2.getMes();
        int anio2 = fecha2.getAnio();
    
        if(anio1 == anio2){
            if(mes1 == mes2){
                if(dia1 == dia2){
                    System.out.println("Las fechas comparadas son iguales");
                }else{
                    if(dia1 < dia2){
                        System.out.println("La fecha " + dia1 + " / " + mes1 + " / "+ anio1 +
                                " es menor a la fecha " + dia2 + " / " + mes2 + " / "+ anio2);
                    }else{
                        if(dia1 > dia2){
                            System.out.println("La fecha " + dia1 + " / " + mes1 + " / "+ anio1 +
                                " es mayor a la fecha " + dia2 + " / " + mes2 + " / "+ anio2);                            
                        }
                    }
                }
            }else{
                if(mes1 < mes2){
                    System.out.println("La fecha " + dia1 + " / " + mes1 + " / "+ anio1 +
                                " es menor a la fecha " + dia2 + " / " + mes2 + " / "+ anio2);
                    System.out.println("La fecha 1 es menor a la fecha 2");
                }else{
                    if(mes1 > mes2){
                        System.out.println("La fecha " + dia1 + " / " + mes1 + " / "+ anio1 +
                                " es mayor a la fecha " + dia2 + " / " + mes2 + " / "+ anio2);
                    }
                }
            }
        }else{
            if(anio1 < anio2){
                System.out.println("La fecha " + dia1 + " / " + mes1 + " / "+ anio1 +
                                " es menor a la fecha " + dia2 + " / " + mes2 + " / "+ anio2);
                
            }else{
                if(anio1 > anio2){
                    System.out.println("La fecha " + dia1 + " / " + mes1 + " / "+ anio1 +
                                " es mayor a la fecha " + dia2 + " / " + mes2 + " / "+ anio2);
                }
            }
        }
    
    }
    
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Fecha date1 = new Fecha(10,8,2014);
        Fecha date2 = new Fecha(9,8,2018);
        Fecha date3 = new Fecha(11,8,2018);
        Fecha date4 = new Fecha(10,7,2018);
        Fecha date5 = new Fecha(24,10,2016);
        
        toString(date3);
        toString(date4);
        toString(date5);
        
        System.out.println("\n" +comparar_igualdad(date1, date4));
        System.out.println("\n");
        comparar(date1, date4);
    }
    
}
