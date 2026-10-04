// WAP to check whether all elements are unique. 

import java.util.Arrays;

public class CheckAllEleAreUniqe14 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(num));
        int res = printFrequency(num);

        if(res == 1){
                System.out.println("All element are uniqe ");
            }
            else
                System.out.println("All element are not unique ");

    }

    public static int printFrequency(int num[]){
        int min = min(num);
        int max = max(num);

        int count[] = new int[max+1];
        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        for(int i=min; i<count.length; i++){
            if(count[i] == 1){
               return 1;
            }
            else
              return -1;
        }
        return -1;
    }

    public static int min(int num[]){
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
                max = num[i];
            }
        }
        return max;
    }
}
