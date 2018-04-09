/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import static pruebas.HashPedrito.agregar;
import static pruebas.HashPedrito.punto3;

/**
 *
 * @author ELO
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        agregar("Google", "EEUU");
        agregar("La locura", "Colombia");
        agregar("Nokia", "Finlandia");
        agregar("Sony", "Japon");
        System.out.println(HashPedrito.contienekey("India"));
    }
    
}
