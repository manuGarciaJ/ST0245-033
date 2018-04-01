package laboratorio03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELO
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Punto2_2 {
    

    public static void procesar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el texto con fallos");
        String g = scan.nextLine();
        
        LinkedList inicio = new LinkedList();
        LinkedList medio = new LinkedList();
        LinkedList fin = new LinkedList();
        
        String aux ="";
        
        int estado=0;
        int ayuda=g.length();
        for(int i =0;i<g.length();i++){
            
            if(g.charAt(i)=='['){
                    if(estado == 0){
                    inicio.addFirst(aux);
                    aux="";
                    estado=1;
                    continue;
                }
                if(estado == 2){
                    fin.addFirst(aux);
                    aux="";
                    estado=1;
                    continue;
                }
                estado = 1;
                inicio.addFirst(aux);
                aux = "";
                continue;
            }
            if(g.charAt(i)==']'){         
                
                if(estado == 0){
                    medio.addFirst(aux);
                    aux="";
                    estado=2;
                    continue;
                }
                if(estado == 1){
                    inicio.addFirst(aux);
                    aux="";
                    estado=2;
                    continue;
                }                
                estado = 2;
                fin.addLast(aux);
                aux="";               
                continue;
            }
            
            if(i == g.length()-1){
               
                if(estado == 1){
                    aux = aux + g.charAt(i);
                    inicio.addFirst(aux);
                }
                if(estado == 2){
                    aux= aux + g.charAt(i);
                    fin.addLast(aux);
                }
            }
            else{
            aux= aux + g.charAt(i);
            }
            
        }
        String rta = "";
        
        for(int i=0;i<inicio.size();i++){
            String auxiliar1 = (String)inicio.get(i);
            rta =  rta + auxiliar1 ;
        }
        
        for(int i=0;i<medio.size();i++){
            String auxiliar1 = (String)medio.get(i);
            rta =  rta + auxiliar1 ;
        }
        for(int i=0;i<fin.size();i++){
            String auxiliar1 = (String)fin.get(i);
            
            rta =  rta + auxiliar1  ;
        }
        System.out.println(rta);
    }
        
}

