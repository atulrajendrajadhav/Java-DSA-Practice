// WAP to create a new array without duplicate elements.

import java.util.Arrays;

public class CreateNewArrayWithoutDublicate8 {
    public static void main(String[] args) {
        int []num = {2, 3, 3, 5, 6, 8, 9 , 7,4, 9, 10};
        System.out.println(Arrays.toString(num));

        int result[] = duplicate(num);
        System.out.println(Arrays.toString(result));
       

    }
        
     public static int[] duplicate(int[] num){
        int min = min(num);
        int max = max (num);

         // 1. Count the frequencies of each element
        int count[] = new int[max +1];
        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        // // 2. Count how many unique elements exist
        int size=0;
         for(int i=min; i<count.length; i++){
            if(count[i] != 0){
              size++; // count unique element 
            }
         }

         // Loop through the input array to maintain elements correctly
         int b[] = new int[size];
         int index = 0;
         
         for(int i=0; i<num.length; i++){
            if (count[num[i]] != 0) {
                b[index] = num[i];
                index ++;
                count[num[i]] = 0;

            }
         }
         return b;
         
         
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

