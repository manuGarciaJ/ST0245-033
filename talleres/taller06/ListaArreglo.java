
package taller6;
public class ListaArreglo<T> {
 private static final int DEFAULT_CAPACITY = 10;
 private int size;
 private T elementos[];
 
    public ListaArreglo(){
     this.elementos= (T[])new Object[DEFAULT_CAPACITY];      
     size=0;
    }
    
    public int size(){
    return size;
    }
    
    public Object get(int index){
      if(index<0 || index>=size){
          throw new IndexOutOfBoundsException("la posicion "+index+"esta fuera de rango");
      }else return elementos[index];
    }

    public void add(T cosa){
       add(size, cosa); 
    }
    
    public void add(int index, T cosa){
       if(size%DEFAULT_CAPACITY==0){
       elementos=aumCap();
       }
        T nuevo[]= (T[])new Object[elementos.length];
        
        if(index<0 || index>=nuevo.length){
          throw new IndexOutOfBoundsException("la posicion "+index+" esta fuera de rango");
      }else{
     
     
     for(int i=0; i<index; i++){
      nuevo[i]=elementos[i];
     }
     
     nuevo[index]=cosa;
     if(index<size){
           for(int j=index+1; j<=size; j++){
           nuevo[j]=elementos[j-1];
           }
        }
      size++;
      }
        for(int k=0; k<elementos.length; k++){
      elementos[k]=nuevo[k];
     }
     }
    
    private T[] aumCap(){
    
     T[]nuevo= (T[])new Object[elementos.length+DEFAULT_CAPACITY];
      for(int i=0; i<elementos.length; i++){
      nuevo[i]=elementos[i];
      }
    
    return nuevo;
    }
    
    }


 
