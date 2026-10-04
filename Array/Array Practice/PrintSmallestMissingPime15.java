// 15. WAP to find the smallest missing prime number. 
public class PrintSmallestMissingPime15 {
    public static void main(String[] args) {
        int num[] = {1, 2 ,4, 6, 8};
        int n = 6;

        printSumOfMissingNum(num, n);
    } 
    public static void printSumOfMissingNum(int[] num, int range){
        int max = max(num);
        boolean []isPresent = new boolean[max + 1];

        for(int i=0; i<num.length; i++){
            if (i <= max) {
                isPresent[num[i]] = true;
            }
        }

        // print false means missing element
        System.out.println("Missing Prime Element is: ");
        for(int i=1; i<= max; i++){
            if (!isPresent[i] && isPrime(i)) {
                System.out.println(i);
                break;
               
            }
        }
        
    }

    public  static boolean isPrime(int num){
       for(int i=0; i<num ; i++){
         if (num < 1) {
            return false;
            }
        }
        for(int i=2; i*i<=num; i++){
            if (num % i ==0) {
                return  false;
            }
        }
        return  true;
    }


    public  static  int max(int num[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return  max;
    }
}
