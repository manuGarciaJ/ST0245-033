import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Mauricio Toro editado por Manuel Garcia
, solucion punto 1 * @version 1
 */
public class DigraphAM extends Graph
{
   int[][] matriz;
   
   public DigraphAM(int size)
   {
      super(size);
      matriz= new int [size+1][size+1];
      for(int i=1; i<=size; i++){
        matriz[i][0]=i;
        matriz[0][i]=i;
        }
   }
   
   public int getWeight(int source, int destination)
   {
       return matriz[source][destination];
    }
   
   public void addArc(int source, int destination, int weight)
   {
      matriz[source][destination] = weight;
   }
  
   public ArrayList<Integer> getSuccessors(int vertex)
   {
       ArrayList<Integer> ans= new ArrayList<>();
     for(int i=1; i<=size; i++){
        if(matriz[vertex][i]!=0){
         ans.add(matriz[0][i]);
        }
        }
     return ans;   
   }
}












