import java.util.Scanner;
import java.util.ArrayList;
/**
 *Esta clase se usa para determinar si uno o varios grafos son bicolorables
 *
 * @author Manuel Garcia
 * @version 1
 */
public class IsBicolorable
{
    public static void DescribirGrafos(){
     System.out.println("Buenas, por favor describa los grafos sobre los cuales quiere preguntar de la siguiente manera:");
     System.out.println("Empiece por decir cuantos nodos tiene el primer grafo, de enter");
     System.out.println("Ahora diga cuantas conecciones tiene este grafo y precione enter");
     System.out.println("Tenga en cuenta que los nodos estan ennumerados desde el 0 hasta el numero de nodos menos 1.");
     System.out.println("Ahora ennumere de la siguiente manera las conecciones entre los nodos:");
     System.out.println("De los numeros de 2 nodos que se relacionan de manera consecutiva y presione enter,");
     System.out.println("Por ejemplo, escribir 32 quiere decir que los nodos 3 y 2 estan relacionados.");
     System.out.println("Haga esto el numero de veces que corresponda al numero de conecciones,");
     System.out.println("Repita esto para todos los grafos sobre los quiera preguntar");
     System.out.println("Para terminar de describir grafos presione 0 y de enter.");
     Scanner sc= new Scanner(System.in);
     int ask=-1;
     while(ask!=0){
       if(ask==-1){
        DigraphAM grafo= new DigraphAM(sc.nextInt());
        int n=sc.nextInt();  
        for(int i=0; i<n; i++){
         int num= sc.nextInt(); 
         int p= num/10;
         int s= num%10;
         grafo.addArc(p,s);
        }
       
        if(IsBicolorable(grafo)){
         System.out.println("BICOLORABLE");
        }else{
         System.out.println("NOT BICOLORABLE");
        }
        
        }else{
        DigraphAM grafo= new DigraphAM(ask); 
        int n=sc.nextInt();  
        for(int i=0; i<n; i++){
         int num= sc.nextInt(); 
         int p= num/10;
         int s= num%10;
         grafo.addArc(p,s);
        }
        //preguntar si el grafo recien creado es bicolorable
        if(IsBicolorable(grafo)){
         System.out.println("BICOLORABLE");
        }else{
         System.out.println("NOT BICOLORABLE");
        }
       }
        ask=sc.nextInt();
        }
    
    }
   
    public static boolean IsBicolorable(DigraphAM g){
     if(g.size<=2){
         return true;
        }else{
        g.matriz[0][0].setColor(true);
         ArrayList<Integer> ligadosACero= new ArrayList (g.getSuccessors(0));
        for(int i=0; i<ligadosACero.size(); i++){     
         g.matriz[0][ligadosACero.get(i)].setColor(false);
        }
        
        for(int x=1; x<g.size; x++){
         ArrayList<Integer> ligados= new ArrayList (g.getSuccessors(x));
         for(int n=0; n<ligados.size(); n++){     
          if(g.matriz[0][x].getColor()==false){
            if(g.matriz[x][ligados.get(n)].getColor()==false){
             return false;
            }else{
             g.matriz[x][ligados.get(n)].setColor(true);
            }
            }
          if(g.matriz[0][x].getColor()==true){
            if(g.matriz[x][ligados.get(n)].getColor()==true){
             return false;
            }else{
             g.matriz[x][ligados.get(n)].setColor(false);
            }
            }   
      
         }
        }
       return true;
        }
    }
    
    public static void main(){
        //con esto se ejecuta el programa.
        DescribirGrafos();
    }
}
