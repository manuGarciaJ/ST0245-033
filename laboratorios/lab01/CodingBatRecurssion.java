
/**
 * Write a description of class CodingBatRecurssion1 here.
 *
 *  
 * @author (Manuel García J)
 * @version (feb 10-12, 2018)
 */
public class CodingBatRecurssion
{
   
    //ponerle String[]args al metodo main cuando se vaya a entregar
    public static void main(String [] args){
     CodingBatRecurssion a= new CodingBatRecurssion();
     //recurssion1
     System.out.println(a.factorial(5));
     System.out.println(a.bunnyEars(12));
     System.out.println(a.fibonnacci(6));
     System.out.println(a.bunnyEars2(2));
     System.out.println(a.powerN(5,4));
     
     //recurssion2
     int [] nums={2,4,8};
     int [] nums6={5,6,2};
     int [] nadj={2,5,10,4};
     int [] sa= {5,2,3};
     System.out.println(a.groupSum(0,nums,14));
     System.out.println(a.groupSum6(0,nums6,7));
     System.out.println(a.groupNoAdj(nadj, 7));
     System.out.println(a.groupSum5(0, nadj, 12));
     System.out.println(a.splitArray(sa));
    }
    
    private int factorial(int n){
     if(n==1){
       return 1; 
        }else return n*factorial(n-1);
    }
    
    public int bunnyEars(int bunnies){
     if(bunnies==0){
       return 0; 
        }else if (bunnies==1){
        return 2;
        }else return 2+bunnyEars(bunnies-1);
    }
    
    public int fibonnacci(int n){
     if(n==0){
        return 0;
        }else if(n==1){
         return 1;
        }else return fibonnacci(n-1)+fibonnacci(n-2);
    }
    
    public int bunnyEars2(int bunnies){
     if (bunnies==0)return 0;
     if(bunnies==1){
        return 2;
        }else if(bunnies%2==0){
        return 3+bunnyEars(bunnies-1);
     }else return 2+ bunnyEars(bunnies-1);
     
    }
    
    public int powerN(int base, int expo){
     if(expo==1){
       return base; 
        }else return base*powerN(base,expo-1);
    }
    
     public boolean groupSum(int start, int[] nums, int target) {
     if(start == nums.length){
            return target == 0 ;
        }
        return groupSum(start+1,nums,target - nums[start]) 
                || groupSum(start+1,nums,target);
    }
    
    public boolean groupSum6(int start, int[] nums, int target) {
     if(start == nums.length){
            return target == 0 ;
        }
     if(nums[start]==6){
         return groupSum6(start+1,nums,target - nums[start]);
        }else return groupSum6(start+1,nums,target - nums[start]) || groupSum6(start+1,nums,target);
                
   }
   
   public boolean g(int start, int[] nums, int target, int former) { //auxiliar de groupNoAdj
     if(start == nums.length){
            return target == 0 ;
        }
      
     if(target<former && start!=0){
         former= target;
        return g(start+1,nums,target,former);
        }
     
     former= target;
        return g(start+1,nums,target - nums[start], former) 
                || g(start+1,nums,target, former);
    }
    
   public boolean groupNoAdj(int[]nums, int target){
     return g(0,nums,target,-1);
    } 
    
   public boolean groupSum5(int start, int[] nums, int target) {
    if(start == nums.length){
            return target == 0 ;
        }
     if(nums[start]%5==0){
         return groupSum5(start+1,nums,target - nums[start]);
        }else if(start!=0 && nums[start-1]%5==0 && nums[start]==1){
         return groupSum5(start+1,nums,target);
        } else return groupSum5(start+1,nums,target - nums[start]) || groupSum5(start+1,nums,target); 
       
   } 
   
   public boolean  splitArray(int[] nums){return ayudante(0,nums,0,0);}
   public boolean ayudante(int start, int[] nums, int sum1, int sum2) {
    if(start == nums.length){
            return sum1 == sum2 ;
        }
        return ayudante(start+1,nums, sum1+ nums[start],sum2) 
                || ayudante(start+1,nums,sum1, sum2+nums[start]);
   }
}
