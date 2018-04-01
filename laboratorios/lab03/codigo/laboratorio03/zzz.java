
/**
 * Aquí está la solución al punto 2.2
 *
 * @author (Manuel García & Isaias Labrador)
 * @version (abril 1, 2018)
 */
public class zzz
{
    public static String puntoDos(String param){
     String aux= new String();
     String salida= new String();
     int next=0;
     while(next<param.length()){
     if(param.substring(next, next+1).equals("[")){
       next++;  
         while(next<param.length()&&param.substring(next, next+1).equals("[")==false&&param.substring(next, next+1).equals("]")==false){
          aux= aux+param.substring(next, next+1);
          next++;
         }
       salida= aux+salida;    
       aux="";
     }else if(param.substring(next, next+1).equals("]")){
       next++;
         while(next<param.length()&&param.substring(next, next+1).equals("[")==false&&param.substring(next, next+1).equals("]")==false){
          aux= aux+param.substring(next, next+1);
          next++;
         }
       salida= salida+aux;    
       aux="";
     }else{
      while(next<param.length()&&param.substring(next, next+1).equals("[")==false&&param.substring(next, next+1).equals("]")==false){
          aux= aux+param.substring(next, next+1);
          next++;
        }
         salida= salida+aux; 
         aux="";
      }
     }
     return salida;
    }
    
    public static void main(){
      System.out.println(puntoDos("This_is_a_[Beiju]_text"));
      System.out.println(puntoDos("[[]][][]Happy_Birthday_to_Tsinghua_University"));
      System.out.println(puntoDos("asd[fgh[jkl"));
      System.out.println(puntoDos("asd[fgh[jkl["));
      System.out.println(puntoDos("[[a[[d[f[[g[g[h[h[dgd[fgsfa[f"));
      System.out.println(puntoDos("asd[gfh[[dfh]hgh]fdfhd[dfg[d]g[d]dg"));
    }
}
