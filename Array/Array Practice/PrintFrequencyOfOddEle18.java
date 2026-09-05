// 18. WAP to print the frequency of odd elements. 

public class PrintFrequencyOfOddEle18 {
     public static void main (String[]args){
        int a[] = {1,2, 3, 5, 1, 2, 3, 4, 5, 3};
        frequemcy(a);

    }
    public static void frequemcy(int num[]){
        int min = min(num);
        int max = max(num);

        int count[] = new int[max+1];
        for(int i=0; i<num.length; i++){
            count [num[i]] ++;
        }
        System.out.println("Frequency of Odd element is: ");
        for(int i=min; i<count.length; i++){
            if (count[i] % 2 !=0 ) {
                System.out.println(i+" =======> "+count[i]);
            }
        }
    }

    public static int max (int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static int min (int num[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }

}
