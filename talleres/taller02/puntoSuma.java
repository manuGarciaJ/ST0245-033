/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres;

/**
 *
 * @author Isaias Labrador Sanchez & Manuel García Jimenez
 */
public class puntoSuma{
    
    //punto 1
    public  static  int  gcd ( int  p , int  q ) {
	   int n=p%q;
            if(n==0){
            return q;
            }else return gcd(q,n);
	}
    
    //punto 2
    private static boolean sumaGrupo(int Start, int[] nums, int target){
        if(Start >= nums.length){
            return target == 0 ;
        }
        return sumaGrupo(Start+1,nums,target - nums[Start]) 
                || sumaGrupo(Start+1,nums,target);
    }
	
    //punto 3
	public static void combinations(String a, String b){
       if(a.length()==0){
       System.out.println(b);
       }else{
       combinations(a.substring(1),b+a.substring(0,1) );
       combinations(a.substring(1),b);
       }
	}
	
    public static void main(String [] args){
        
        int [] a = {2,4,8};
        
        System.out.println(sumaGrupo(0, a, 13));
         System.out.println(gcd(345,150));
        System.out.println(gcd(28,20));
	combinations("hola", "");
    }
    
}
