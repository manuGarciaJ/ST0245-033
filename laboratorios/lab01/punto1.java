/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author Isaias Labrador - Manuel Garcia Jimenez 
 */
public class Laboratorio {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] n = {5,8,9,1000,2,7};
        
        System.out.println("SUMA DE LOS ELEMENTOS\n");
        System.out.println(arreglo(n,n.length-1));
        System.out.println("MAXIMO DEL ARREGLO\n");
        System.out.println(maximoArreglo(n,0,n.length-1));
        System.out.println("FIBONACCI\n");
        System.out.println(fibonacci(100));
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
    
    public static int fibonacci(int n){
    
        if(n == 0){
            return 0;
        }
        if(n == 2 || n == 1){
            return 1;
        }
        else{
            return fibonacci(n-2) +fibonacci(n-1);
        }
    
    }
}

