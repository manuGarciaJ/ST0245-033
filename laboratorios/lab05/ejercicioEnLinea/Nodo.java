
/**
 * Write a description of class Nodo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nodo
{
    public int id;
    public boolean color; //true es rojo, false es azul
   
    
    /**
     * Constructor for objects of class Nodo
     */
    public Nodo(int iden)
    {
        id=iden;
        
    }
    
     public void setId(int c){
      id= c;
    }
    
     public void setColor(boolean c){
      color= c;
    }
    
     public boolean getColor(){
      return color;
     }   
     
}
