/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio03;

import java.util.LinkedList;

/**
 *
 * @author ELO
 */
public class Banco {
    
    public static void simular(LinkedList filas){
        int cajero = 1;
        
        int cont= 0;
        
        while(!filas.isEmpty()){
            int max = filas.size();
            
            LinkedList aux= (LinkedList) filas.get(cont);
           
            if(cont == 0 && aux.size() == 1){
                filas.remove(cont);
                continue;
            }
            if(aux.size()==1){
               filas.remove(cont);
               if(cont >= filas.size()-1){
                   cont=0;
               }else{
                   cont ++;
               }               
               continue;
               
            }else{
               String nom = (String) aux.get(1);
               System.out.println("a " + nom + " de la fila:" + aux.get(0)+ " lo atiende el cajero: " + cajero );
               aux.remove(1);
               if(cajero==1){cajero =2;}else{cajero=1;}
            }
            if(cont<max-1){
                cont++;
            }else{
                if(cont == max-1){
                    cont = 0;
                }
            }
        }
    }
    
}
