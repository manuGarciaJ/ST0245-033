
/**
 * Write a description of class Contador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contador
{
    // instance variables - replace the example below with your own
    private int n=0;
    private int incre=0;
    String Id;

    /**
     * Constructor for objects of class Contador
     */
    public Contador(String id)
    {
        Id=id;
        
    }

    public void incrementar(){
     n++;
     incre++;
    }
    
    public int incrementos(){
     return incre;
    }
    
    public String toString(){
     return Id+String.valueOf(n)+" "+String.valueOf(incre);
    }
}
