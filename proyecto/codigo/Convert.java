/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_datos;

/**
 *
 * @author Labrador
 */
public class Convert {
    public static int convertir_y(double entero){
        double entero2 = (double)(entero - 6.30);
        int aux2 = (int) (entero2 *10000);
        return (int) ((aux2 - 700)*-1);
    }
    public static int convertir_x(double entero){        
        double entero2 = (double)(entero + 75.50);
        int aux2 = (int) (entero2 * 10000);
        return (int) (1000+aux2);
    }
    
    
}
