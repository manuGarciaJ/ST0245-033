
package taller10;

/**
 *
 * @author Manuel Garcia
 */

public class Node {
    public Node right;
    public Node left;
    public Node actual;
    int data;
    
    public Node (int d){
     data=d;
    }
    
    public boolean buscar(int n){
     if(n==data){
     return true;
     }else if(n<data){
      if(left==null){
       return false;
      }else{
       return left.buscar(n);
      }
     }else{
     if(right==null){
      return false;
     }else return right.buscar(n);
    }
    }
    
   
    
    public void insertar(int n){
     if(n<data){
      if(left==null){
       left= new Node(n);
      }else{
       left.insertar(n);
      }
     }else{
     if(right==null){
      right= new Node(n);
     }else right.insertar(n);
    }
    }

    public Node goRight(){
     return right;
    }
   
    
    public void borrar(int n){
     if(data==n){
      //reemplazar por siguiente más pequeño
      if(left==null){
       data=0;
       
      }else{
      Node l= left;
      while(l.goRight()!=null){
       l= l.goRight();
      }
      
      data=l.data;
      }
     }else if(n<data){
      if(left!=null){
      left.borrar(n);
      }
     }else{
      if(right!=null){
       right.borrar(n);
      }
     }
     }
    
    public void printInOrder(){
    if(left!=null){
     left.printInOrder();
    }
    System.out.print(data+" ");
    if(right!=null){
    right.printInOrder();
    }
    }
    
    public static void main(String [] args){
     Node root= new Node(10);
     root.insertar(8);
     root.insertar(12);
     root.insertar(7);
     root.insertar(9);
     root.insertar(11);
     root.insertar(13);
     root.printInOrder();
     System.out.println();
     root.insertar(15);
     root.printInOrder();
     System.out.println();
     root.borrar(10);
     root.printInOrder();
     System.out.println();
    }
}


