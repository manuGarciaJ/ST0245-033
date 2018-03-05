/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import java.util.Random;

/**
 *
 * @author Isaias Labrador - Manuel Garcia Jimenez 
 */
public class Laboratorio {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tiempos(500);
    }
    
    public static void tiempos(int max){
        Random generator = new Random();
        //for(int i = 1000000;i<2000000; i=i+100000){
            
            int x = generator.nextInt(max);            
            int size = 22000;
            int [] a = generator1(size,max);
            
            long startTime = System.nanoTime();
                Laboratorio_2.mergeSort(a);
            long endTime = System.nanoTime()- startTime;
                
            System.out.println("100 m " + endTime);
        //}
    }
    
     public static int [] generator1(int size, int max){

        int[] arr = new int[size];
        Random generator = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = generator.nextInt(max);                
            }
        return arr;
    }
    
    public static void llenar(int [] a){        
        for(int i = 0; i<a.length;i++){
            a[i]= i+i*i;
            System.out.println("a["+i+"]"+ " = " + a[i]);
        }
    }
    
    /**
     * 
     * @param a
     * @param largo
     * @return LA SUMA DE TODOS LOS ELEMENTOS DEL ARREGLO DE ENTEROS -->> CODIGO REALIZADO
     * CON LA AYUDA DE LA CARPETA CODIGO DE LABORATORIO EN GIT DEL PROFESOR MAURICIO 
     */
    public static int arreglo(int [] a, int largo){
        int suma;
        if(largo == 0){
            return suma = a[largo];
        }
        else{
            suma = a[largo] + arreglo(a, largo-1);
            return suma;
        }
        
    }
    /**
     * 
     * @param a
     * @param max
     * @param length
     * @return EL VALOR MAXIMO DE EL ARREGLO DE ENTEROS QUE SE RECIBE COMO PARAMETRO 
     */
    public static int maximoArreglo(int [] a, int max, int length){
    
        if(length == -1){
            return max;
        }
        if(max > a[length]){
            return maximoArreglo(a, max, length-1);
        }        
        else{
            return maximoArreglo(a, a[length], length-1);
        }
          
    }
    /**
     * 
     * @param n
     * @return EL VALOR EN LA POSICION N DE LA SERIE FIBONACCI
     */
    public static int fibonacci(int n){
    
        if(n == 0){
            return 0;
        }
        if(n == 2 || n == 1){
            return 1;
        }
        else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    
    }
}

