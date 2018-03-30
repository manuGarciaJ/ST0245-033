/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio03;

/**
 *
 * @author ELO
 */
public class LinkedListMauricio {
 /**
     * @param args the command line arguments
     */
    Node first;
    int size;
    
    public LinkedListMauricio(){
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
    public Node getNode(int index) throws IndexOutOfBoundsException {
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
    
    public void insert(int value, int index){
            
        //cuando el arreglo este vacio
        if (this.size() == 0){
            Node nuevo = new Node(value);
            this.first = nuevo;
            System.out.print("~~ al estar la lista vacia se creo el elemento en la posicion 0, para ahorrar memoria");
        }
        else{
            
            if(index > this.size() && index>0){
                System.out.println("~~ Lo siento, sin insertamos en esa posicion \nquedarian varios espacios sin \"utilizar\"");
            }
            else{
            // cuando haya que insertar en la posicion 0
            if(index == 0){
            Node aux = getNode(0);
            Node niu = new Node(value);
            this.first = niu;
            niu.ref = aux;
            
            //cuando haya que insertar en cualquier punto diferente
            //de los anteriores
            }else{
                
                if(index == this.size()){
                    Node actual = getNode(index-1);
                    Node niu2 = new Node(value);
                    actual.ref = niu2;
                    
                
                }else{
            
                Node actual = getNode(index);
                Node anterior = getNode(index-1);
                
                Node niu2 = new Node(value);
                
                anterior.ref = niu2;
                niu2.ref = actual;
                }
            }
            }
        }
    }
    
    // Borra el dato en la posición index
    public void remove(int index)
    {
        if (this.size() == 0){
            System.out.println("~~ Lo siento, No hay nada que borrar");
        }
        else{
        if(index == 0){
            Node aux = getNode(index+1);
            Node aux2 = getNode(index);
            this.first = aux;
            aux2.ref = null;
            
        }else{
            Node borrado = getNode(index);
            Node Anterior = getNode(index-1);
            Anterior.ref = borrado.ref;
            borrado.ref = null;
        }
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
}
