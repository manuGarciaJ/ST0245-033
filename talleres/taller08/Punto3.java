/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres;

import java.util.Stack;
import static talleres.taller5.llenar;

/**
 *
 * @author ELO
 */
public class Stacks {
    
    public static void cadena(String s){
        Stack<Integer> c = new Stack<>();
        c.push(0);
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='*'){
                int aa = c.pop();
                int bb = c.pop();
                int aux = aa * bb;
                c.push(aux);
                continue;
            }
            if(s.charAt(i)== '/'){
                int aa = c.pop();
                int bb = c.pop();
                int aux = aa / bb;
                c.push(aux);
                continue;
            }
            if(s.charAt(i)== '+'){
                int aa = c.pop();
                int bb = c.pop();
                int aux = aa + bb;
                c.push(aux);
                continue;
            }
            if(s.charAt(i)=='-'){
                int aa =c.pop();
                int bb =c.pop();
                int aux = bb - aa;
                c.push(aux);
                continue;            
            }
            if(s.charAt(i)==' '){
                continue;
            }
            String aux= s.charAt(i)+"";
            int aux2 = Integer.parseInt(aux);
            c.push(aux2);
            
        }
        System.out.println(c.pop());
    }
    
    public static void main(String[] args){
        cadena("3 5 * 2 +");
        
      
    }
    
}
