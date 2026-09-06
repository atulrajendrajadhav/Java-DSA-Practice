// 12. WAP to print missing palindrome numbers. 
public class PrintMissingPalindromeEle12 {
     public static void main(String[] args) {
        int num[] = { 10, 50};
        int n = 6;

        printSumOfMissingNum(num, n);
    } 
    public static void printSumOfMissingNum(int[] num, int range){
        int max = max(num);
        int min = min(num);
        boolean []isPresent = new boolean[max + 1];

        for(int i=0; i<num.length; i++){
            if (i <= max) {
                isPresent[num[i]] = true;
            }
        }

        // print false means missing element
        System.out.println("Missing Palindrome Element is: ");
        for(int i=min; i<= max; i++){
            if (!isPresent[i] && isPalindrome(i)) {
                System.out.println(i);
               
            }
        }
        
    }

    public  static boolean isPalindrome(int num){
       int temp = 0;
       int original = num;
       int rev = 0;

       for(int i=0; i<num; i++){
        temp = num % 10;
        rev = rev *10 +temp;
        num = num/ 10;
       }
       return original == rev;
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
    public  static  int min(int num[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return  min;
    }
}
