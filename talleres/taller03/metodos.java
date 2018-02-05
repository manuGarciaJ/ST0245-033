package tres;

/**
 *
 * 
 */
public class Tres {

    
      public static void main(String[] args) {
       
        int n = 3;                  //Cuantos quiero escoger
        int r = elementos.length;   //Elementos elegidos
        String abc="abc";
        punto3(abc, "", 3,3);
        punto4(abc, "", 3,3);
        punto2(abc, "");
    }

    
    public static void punto2(String a, String b){
       if(a.length()==0){
       System.out.println(b);
       }else{
       punto2(a.substring(1),b+ a.substring(0,1) );
       punto2(a.substring(1),b);
       }
	}
    
    public static void punto3(String a, String act, int n, int r){
     
     if(n==0){
     System.out.println(act);
     }else{
      for(int i=0; i<r; i++){
       if(!act.contains(a.substring(i,i+1))){
         punto3(a, act+a.charAt(i),n-1,r);
       }
      }
     }
    }
    
    public static void punto4(String a, String act, int n, int r){
     
     if(n==0){
     System.out.println(act);
     }else{
      for(int i=0; i<r; i++){
       
         punto4(a, act+a.charAt(i),n-1,r);
       
      }
     }
    }
} 
