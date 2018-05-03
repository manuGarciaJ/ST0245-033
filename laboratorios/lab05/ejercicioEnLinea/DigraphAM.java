import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro editado por Manuel Garcia
 * @version 1
 */
public class DigraphAM 
{
   Nodo[][] matriz;
   int size;
   public DigraphAM(int s)
   {
      size=s;
      matriz= new Nodo [size][size+1];
      int j=0;
      for(int i=0; i<=size; i++){
        if(j==0){
         for(int x=0; x<size;x++){
           matriz[x][0]= new Nodo(x); 
            }
            j=1;
        }else{
         for(j=0; j<size;j++){
          matriz[j][i]= new Nodo(0);
         }
        }  
        
        }
   }
   
   public int getWeight(int source, int destination)
   {
       return matriz[source][destination].id;
    }
   
   public void addArc(int source, int destination)
   {
     matriz[source][destination+1].setId(1);
   }
  
  public ArrayList<Integer> getSuccessors(int vertex)
   {
       ArrayList<Integer> ans= new ArrayList<>();
     for(int i=1; i<size; i++){
        if(matriz[vertex][i].id!=0){
         ans.add(i);
        }
        }
     return ans;   
   }
}
