
package taller5;

/**
 *
 * @author Manuel García 
 */
public class Taller5 {

     
    public static void main(String[] args){
       MedirTiempo();
        
    }
    
    public static void MedirTiempo(){
    for (int i = 10000; i < 11000; i = i + 100) {
          long ahora = System.currentTimeMillis();
          tablas(i); //o el metodo para el que se quiera medir repidez
          long deNuevo = System.currentTimeMillis();
          long haPasado = deNuevo - ahora;
          //imprime el valor de i (la tabla de multiplicar creada) y el timepo que se tardo en hacerlo
          System.out.println(i+ ", " + haPasado); 
        }
    }
    
    
    public static void ArraySum(int n){
    int i,sum;
    sum=0;
     int A[]= new int[n];
      for(i=0; i<n; i++){
         A[i]=i; 
        sum+=A[i];
      }
    System.out.println(sum);
    }

    public static void tablas(int n){
        int h;
        for (int i = 0; i < n; i++)
           for (int j = 0; j < n; j++)
               h = i*j;
    }
    
    public static void Ordenar(int [] A){
      int n =A.length;
      for(int i=0; i<n; i++){
      int j=i;
        while(j>0 && A[j-1]>A[j]){
          int temp=A[j];
          A[j]=A[j-1];
          A[j-1]=temp;
          j--;
        }
      }
    }
    
}
