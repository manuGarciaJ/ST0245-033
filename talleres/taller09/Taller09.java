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
public class Taller09 {

    // Ojo, esta tabla definida así no permite manejar las colisiones

    private int [][] tabla;

    public Taller09(){
        this.tabla = new int [10][10];        
    }

    // Ojo, esta función hash es muy ingenua
    private int funcionHash(String k){
          
          return (((int) k.charAt(0)) % 10*10) +((int) k.charAt(1)) % 10;
    }    
    // Ojo con las colisiones
    public void put(String k, int v){
        int x = funcionHash(k);
        int [] aux = tabla[x/10];
        aux[x%10]= v;
    }
    private int getB(String k){
        int x = funcionHash(k);
        int [] aux = tabla[x/10];
        if(aux[x%10] == 0){
            return -1;
        }else{
            return (int) aux[x%10];
        }
    }
    public void get(String k){
        if(k.length()== 0){
            System.out.println("No creo que encuentres algo con una Key vacia .-.");
            return;
        }
        if(getB(k)== -1){
            System.out.println("Lo siento no hay valores para esa Key");
        }else{
            System.out.println("Valor con key " + k + " es: " + getB(k));
        }
    }
}


