//6. WAP to count the total number of duplicate elements. 
public class CountDublicateEle6 {
    public static void main(String[] args) {
        int num[] = {3, 3, 4, 8, 9, 9, 9, 4, 6,5};
        printFrequency(num);
    }
    public static void printFrequency(int num[]){
        int min = min(num);
        int max = max(num);
        
        int count[] = new int[max +1];


        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        int cnt =0;
        for(int i=min; i<count.length; i++){
            if(count[i] > 1){
                cnt  ++; // count dublicate element 
            }
        }
        System.out.println("Dublicate element in Array is:: "+cnt);
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
        int max= Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max ;
    }
}
