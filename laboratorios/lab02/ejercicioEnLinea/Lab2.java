/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.util.ArrayList;
public class Lab2 {
    public int sum13(int[] nums) {
      int sum=0;
        if(nums.length>0){
         if(nums[0]!=13)sum+=nums[0];
            for(int i=1; i<nums.length; i++){
             if(nums[i]!=13 && nums[i-1]!=13){
             sum+=nums[i];
            }
        }
     }
     return sum;
    }
    
    public boolean only14(int[] nums) {
     if(nums.length<1)return true;
      for(int i=0; i<nums.length; i++){
       if(nums[i]!=1 && nums[i]!=4)return false;
       }
     return true;
    }
    
    public ArrayList evenOdd(int[] nums){
    
     ArrayList <Integer> ans = new ArrayList<>();
     ArrayList <Integer> evens = new ArrayList<>();   
     ArrayList <Integer> odds = new ArrayList<>();
     for(int i=0; i<nums.length; i++){
      if(nums[i]%2==0){
       evens.add(nums[i]);
      }else odds.add(nums[i]);
     }
     ans.addAll(evens);
     ans.addAll(odds);
     return ans;
    }
    
    public int[] fizzArray(int n) {
      int [] a= new int [n];
      for(int i=0; i<n; i++){
        a[i]=i;
      }
     return a;
}
    
    public int matchUp(int[] nums1, int[] nums2) {
      int count=0;
      for(int i=0; i<nums1.length; i++){
        if(nums1[i]-nums2[i]<=2 &&nums1[i]-nums2[i]>=-2&&nums1[i]-nums2[i]!=0)count++;
       }
     return count;
    }
    
    //Array-3:
    
    public int maxSpan(int[] nums) {
      int max=0;
      int current=0;
      if(nums.length==0)return 0;
      for(int i=0; i<nums.length; i++){
         for(int j=nums.length-1; j>=0; j--){
            if(nums[i]==nums[j]){
             current=j-i+1;
                if(current>max){
                 max=current;
                }
             break;
            }
         }
        }
     return max;
    }
    
    public boolean linearIn(int[] outer, int[] inner) {
     boolean found=false;
     for(int i=0; i<inner.length; i++){
        for(int j=0; j<outer.length; j++){
            if(inner[i]==outer[j]){
            found=true;
            break;
            } 
        }
        if(!found)return false;
        found=false;
        }
    return true;
    }
    
    public boolean canBalance(int[] nums) {
  int izq=0; 
  int der=0;
  for(int i=1; i<nums.length; i++){
    for(int j=0; j<i; j++){
      izq+=nums[j];
    }
    for(int k=i; k<nums.length; k++){
      der+=nums[k];
    }
    if(izq==der)return true;
    izq=0;
    der=0;
  }
  return false;
}
    
    public int countClumps(int[] nums) {
  int count=0;
  int tam=0;
  for(int i=0; i<nums.length-1; i++){
    if(nums[i]==nums[i+1]){
      count++;
     for(int j=i; j<nums.length; j++){
       if(nums[j]==nums[i]){
        tam++;
       }else break;
     } 
    i+=tam-1;
     tam=0;
    }
  }
  return count;
}
    
    public int[] fix34(int[] nums) {
  int []ans= new int[nums.length];
   int pos4=0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==3){
     ans[i]=nums[i];  
     for(int j=pos4+1; j<nums.length; j++){
       if(nums[j]==4){
         pos4= j;
         int temp= nums[i+1];
         ans[i+1]=nums[j];
         ans[j]=temp;
         break;
       }
     }
     for(int k=i+1; k<nums.length; k++){
       if(ans[k]>0){
         i++;
       }else break;
     }
     
    }else if(ans[i]<=0){
     ans[i]=nums[i]; 
    }
  }
  return ans;
}
    
    public static void main(String[] args) {
      Lab2 lab= new Lab2();
      int []a= {1,2,2,1,13};
      int []b={1,3,3,0,9};
      int []d={1,3,1,4};
      System.out.println(lab.sum13(a));
      System.out.println(lab.only14(a));
      System.out.println(lab.evenOdd(a));
      int []fizz= lab.fizzArray(5);
      for(int i=0; i<fizz.length; i++){
      System.out.print(fizz[i]);
      }
      System.out.println();
      System.out.println(lab.matchUp(a,b));
      //Hasta aqui los de Array-2
      System.out.println(lab.maxSpan(a));
      int [] inner= {2,4};
      int [] outer={1,2,4,6};
      System.out.println(lab.linearIn(outer, inner));
      int[]c= {1,1,1,2,1};
       System.out.println(lab.canBalance(c));
        System.out.println(lab.countClumps(a));
        int [] fixed= lab.fix34(d);
        for(int x=0; x<fixed.length; x++){
        System.out.print(fixed[x]);
        }
        System.out.println();
        
    }
    
}
