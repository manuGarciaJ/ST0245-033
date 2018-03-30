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
import java.util.Scanner;
import java.util.Stack;

public class Punto2_2 {
    

    public static void procesar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el texto con fallos");
        String g = scan.nextLine();
        
        Stack pila = new Stack();
        
        Stack inicio = new Stack();
        Stack fin = new Stack();
        String resul = "";
        int estado = 0; /// 0 significa sin [ o ] antes, 1 significa [ "inicio" y 2 significa ] "Fin"
        
        for(int i = 0; i<g.length(); i++){
            char aux = g.charAt(i);
            if(aux == '['){
                estado = 1;               
                continue;
            }
            if(aux == ']'){
                estado = 2;
                continue;
            }
            if(estado == 0){
                resul = resul + g.charAt(i);
            }else{
                if(estado == 1){
                    inicio.push(g.charAt(i));
                }else{
                    fin.push(g.charAt(i));
                }
            }
            
        }
        int sizeini = inicio.size();
        for(int i = 0; i<sizeini;i++){
            char aux = (char)inicio.pop();
            if(aux != '['){
            resul = aux + resul;
            }
        }
        int sizefin = fin.size();
        String lo = "";
        for(int i = 0; i<sizefin;i++){
            char aux = (char)fin.pop();
            lo = aux + lo;
        }
        resul = resul + lo;
        
        System.out.println(resul);
    }
    
    
    
}
