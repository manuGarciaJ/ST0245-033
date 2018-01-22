
/**
 * Write a description of class Punto2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Punto2D
{
    
    private float x;
    private float y;

    public Punto2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    public float GetX(){
     return x;
    }
    
    public float GetY(){
     return y;
    }
    
    public float radio(){
     return (float) Math.sqrt((x*x)+(y*y));
    
    }

    public float distancia(Punto2D punto){
     return (float) Math.sqrt(Math.pow(x-punto.GetX(),2)+Math.pow(y-punto.GetY(),2));
    }
     
    double angulo(){
        return (float) Math.atan(y/x);
    }
}
