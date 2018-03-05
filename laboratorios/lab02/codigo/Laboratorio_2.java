/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author Labrador
 * @Date 4/03/2018
 */
import java.util.Arrays; 
import java.util.Random;
import static laboratorio.Laboratorio.generator1;
import static laboratorio.Laboratorio.maximoArreglo;


public class Laboratorio_2{
    // Computer the sum of an array
    
    /**
    * Title ; Laboratory1
    * Author: Toro, M
    * Date 2018
    * Code Version: 1
    * Availability: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab02/codigo/Java/Laboratory1/Laboratory1.java
    * Codigo tomado del profesor
    */    
    public static int ArraySum(int[] A){          
      int sum = 0;
      for (int i = 0; i < A.length; i++)
         sum = sum + A[i];
      return sum;
    }

    /**
    * Title ; Laboratory1
    * Author: Toro, M
    * Date 2018
    * Code Version: 1
    * Availability: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab02/codigo/Java/Laboratory1/Laboratory1.java
    * Codigo tomado del profesor
    */ 
    // Computes the maximum value of an array
    public static int ArrayMax(int[] A){
      int max = A[0];
      for (int i = 0; i < A.length; i++)
         if (A[i] > max)
           max = A[i];
      return max;
  }
  /**
    * Title ; Laboratory1
    * Author: Toro, M
    * Date 2018
    * Code Version: 1
    * Availability: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab02/codigo/Java/Laboratory1/Laboratory1.java
    * Codigo tomado del profesor
    */ 
    // Sorts an array using Insertion Sort
    public static void InsertionSort(int[] A){
       int temp,j;
       for (int i = 0; i < A.length; i++)
       {
         j = i;
         while (j > 0 && A[j-1] > A[j])
           {
               temp = A[j];
               A[j] = A[j-1];
               A[j-1] = temp;
               j = j-1;
            }           
       }
       
    }

    // Sorts an array using Merge Sort
    // Taken from www.cs.cmu.edu/
    public static void mergeSort(int [ ] a){
        
    int[] tmp = new int[a.length];
    mergeSort(a, tmp,  0,  a.length - 1);
  }

    /**
    * Title ; Laboratory1
    * Author: Toro, M
    * Date 2018
    * Code Version: 1
    * Availability: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab02/codigo/Java/Laboratory1/Laboratory1.java
    * Codigo tomado del profesor
    */ 
    
    private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right){
        if( left < right ){
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    /**
    * Title ; Laboratory1
    * Author: Toro, M
    * Date 2018
    * Code Version: 1
    * Availability: https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab02/codigo/Java/Laboratory1/Laboratory1.java
    * Codigo tomado del profesor
    */
    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd ){
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
    
    
    public static void tiempos2(int max){        
        Random generator = new Random();
        for(int i = 10000;i<20000; i=i+1000){
            int x = generator.nextInt(max);
            int [] a = generator1(i, max);
            
            long startTime = System.nanoTime();
                int hey = maximoArreglo(a, 0, i-1);                 
            long endTime = System.nanoTime()- startTime;
                
            System.out.println(i + "==" + endTime);
        }
    
    }    
}
