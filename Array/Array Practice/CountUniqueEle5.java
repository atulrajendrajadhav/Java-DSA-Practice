// WAP to count the total number of unique elements.

import java.util.Arrays;

public class CountUniqueEle5 {
    public static void main(String[] args) {
        int num[] = {3, 4, 4, 5, 5,8, 9, 6};
        printFrequency(num);
    
    }
    public static void printFrequency(int num[]){
        int min = min(num);
        int max = max (num);

        int count[] = new int[max +1];
        for(int i=0; i<num.length; i++){
            count[num[i]] ++;

        }
        int cnt =0;
         for(int i=min; i<count.length; i++){
            if(count[i] == 1){
              
              cnt++; // count unique element 
            }
         }
         System.out.println("Unique Element in array is: "+cnt);
         System.out.println(Arrays.toString(count));
    }

    public static int min (int []num){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

    public static int max(int num[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max  = num[i];
            }
        }
        return max;
    }
}
