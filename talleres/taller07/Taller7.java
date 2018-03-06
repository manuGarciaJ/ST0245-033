/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller7;

/**
 *
 * @author cl18412
 */


public class Taller7 {

    /**
     * @param args the command line arguments
     */
    private Node first;
    private int size;
    
    public Taller7(){
	first = null;
        size = 0;
    }
    
    public int getSize(Node first, int cont){        
        if(first.ref == null){
            return cont;
        }
        else{
            return getSize(first.ref, cont+1);
        }
    }
    
    public int size(){
        if(this.first!=null){
        return getSize(this.first, 1);
        }else{
            return 0;
        }
    }
    
    
    
    /**
     * CODIGO TOMADO DEL GITHUB DEL PROFESOR MAURICIO TORO : https://github.com/mauriciotoro/ST0245-Eafit/blob/master/talleres/taller07/ED1-TallerS7%20Listas%20Vr%202.0%20.pdf
    * Returns the node at the specified position in this list.
    * @param index - index of the node to return
    * @return the node at the specified position in this list
    * @throws IndexOutOfBoundsException
    */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < this.size()) {
                Node temp = first;
                for (int i = 0; i < index; i++) {
                        temp = temp.ref;
                }
                return temp;
        } else {
                throw new IndexOutOfBoundsException();
        }
    }
    /**
     * CODIGO TOMADO DEL GITHUB DEL PROFESOR MAURICIO TORO : https://github.com/mauriciotoro/ST0245-Eafit/blob/master/talleres/taller07/ED1-TallerS7%20Listas%20Vr%202.0%20.pdf
     * @param index
     * @return 
     */
    public int get(int index){
        Node temp = null;
        try{
            temp = getNode(index);
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            System.exit(0);
        }
        return temp.value;
    }
    
    
    
    public void insert(int value, int index){
            
        //cuando el arreglo este vacio
        if (size == 0){
            Node nuevo = new Node(value);
        }
        else{
            // cuando haya que insertar en la posicion 0
            if(index == 0){
                
            Node niu = new Node(value);
            niu.ref = getNode(0);
            
            //cuando haya que insertar en cualquier punto diferente
            //de los anteriores
            }else{
            
                Node actual = getNode(index);
                Node anterior = getNode(index-1);
                
                Node niu2 = new Node(value);
                
                anterior.ref = niu2;
                niu2.ref = anterior;
                
            }
        }
        
    }
    
    // Borra el dato en la posición index
    public void remove(int index)
    {
        if (size == 0){
            System.out.println("Lo siento, No hay nada que borrar");
        }
        if(index == 0){
            Node aux = getNode(index);
            aux.ref = null;
        }else{
            Node borrado = getNode(index);
            Node Anterior = getNode(index-1);
            Anterior.ref = borrado.ref;
            borrado.ref = null;
        }
       
    }
    public boolean contains(int data)
    {
        for(int i = 0; i<size;i++){
            Node aux = getNode(i);
            if(aux.value == data){
                return true;
            }
        }
        return false;
    }
    
    public int maximo(int max, int actual){
        if(actual == size){
            return max;
        }else{
            Node aux = getNode(actual);
            if(aux.value > max){
                return maximo(aux.value, actual+1);
            }else{
                return maximo(max, actual+1);
            }
        }
    }
    public static boolean equal(Taller7 a, Taller7 b){
    
        if(a.size() != b.size()){
            return false;
        }else{
            for(int i=0;i<b.size(); i++){
                
                Node aux1 = b.getNode(i);
                Node aux2 = a.getNode(i);
                
                if(aux1.value != aux2.value){
                    return false;
                }
            }
            return true;
        }
    
    }


    public static void main(String[] args) {
        Taller7 test = new Taller7();
        Node uno = new Node(10);        
        test.first = uno;        
        Node dos = new Node(25);
        Node tres = new Node (99);
        uno.ref = dos;
        dos.ref = tres;
        
        
        
        //_____________________________________
        
        Taller7 test1 = new Taller7();
        Node uno1 = new Node(10);
        Node dos2 = new Node(26);
        Node tres3 = new Node (99);
        test1.first = uno1;        
        uno1.ref = dos2;
        dos2.ref = tres3;
        
        
        
       
    
    }
}
