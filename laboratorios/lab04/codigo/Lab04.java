/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 */
public class Lab04 {
   
    /**
     * 
     * @param str 
     */
    public static void posOrden(String str){
        // se obtienen los valores del arbol derecho
        ArrayList<Integer> derecha = separarDer(str);
        // Se obtienen los valores del arbol izquierdo
        ArrayList<Integer> izq = separarIzq(str);
        
        boolean sub = false;
        Stack aux = new Stack();
        int raiz = Integer.parseInt(str.substring(0,2));
        int auxiliar = raiz;
        
        for(int i=0; i<izq.size();i++){          
            if(izq.get(i)== 0){continue;}
            if(izq.get(i)<= auxiliar){
                auxiliar = izq.get(i);
                aux.add(auxiliar);
            }else{                
                int comparando = (int) aux.pop();
                if(izq.get(i)>comparando){
                    System.out.println(comparando);
                    System.out.println(izq.get(i));
                }else{
                    System.out.println(izq.get(i));
                    System.out.println(comparando);
                }
                if(i==izq.size()-1){
                    System.out.println(aux.pop());
                    
                }
            }

        }
        for(int i =derecha.size()-1; i>=0;i--){
            System.out.println(derecha.get(i));        
        }       
        System.out.println(aux.pop());
    }
    
    public static ArrayList separarIzq(String s){
        int numero = 0;
        int comparacion = Integer.parseInt(s.substring(0,2));
        ArrayList<Integer> aux = new ArrayList<>();
        String num = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)== ' '){
                num = num + '0';
            }else{
                if(s.charAt(i)!= '\n'){
                    num = num + s.charAt(i);
                }else{
                    if(Integer.parseInt(num)<=comparacion){
                    aux.add(Integer.parseInt(num));
                    numero++;
                    num = "";
                    }else{
                        break;
                    }
                }
            }
        }
        return aux;
    }
    
    public static ArrayList separarDer(String s){
        int numero = 0;
        int comparacion = Integer.parseInt(s.substring(0,2));
        ArrayList<Integer> aux = new ArrayList<>();
        String num = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)== ' '){
                num = num + '0';
            }else{
                if(s.charAt(i)!= '\n'){
                    num = num + s.charAt(i);
                }else{
                    if(Integer.parseInt(num)> comparacion){
                        aux.add(Integer.parseInt(num));
                        numero++;
                        num = "";
                    }else{
                        num = "";
                        continue;
                    }
                }
            }
        }
        aux.add(Integer.parseInt(num));
        return aux;
    }
}
