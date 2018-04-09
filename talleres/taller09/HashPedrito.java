/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author ELO
 */
import java.util.HashMap;

public class HashPedrito {    
    
   public static HashMap<String, String>h=new HashMap<String, String>();
   
    //punto2
    public static void agregar(String llave, String valor){
     h.put(llave,valor);
    }
    
    public static String punto3(String key){
     if(h.containsKey(key)){
       return h.get(key);
     }else return "La empresa "+key+" no esta ";     
    }
    
    
    public static boolean contienekey(String value){
        if(h.containsValue(value)){
            return true;
        }
        return false;
    } 
}
