// WAP to check whether an element is repeated or not. 

public class CheckEleReapetedOrNot13 {
    public static void main(String[] args) {
        int num[] = {3, 3, 7 , 5, 4,9 ,4 ,9, 4, 3};
        printFrequency(num);

    }

    public static void printFrequency(int num[]){
        int min = min(num);
        int max = max(num);

        int count[] = new int[max+1];
        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        for(int i=min; i<count.length; i++){
            if(count[i] > 1){
                System.out.println(i+" Element is repeated "+count[i]+" times");
            }
            else
                System.out.println(i+" Element is not repeated");
        }
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
