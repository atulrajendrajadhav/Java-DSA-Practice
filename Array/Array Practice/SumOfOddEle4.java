public class SumOfOddEle4 {
    public static void main(String [] args) {
        int number[]  = {10, 20, 30, 3, 5};
        sumOfOdd(number);
    }
    public static void sumOfOdd(int [] number) {
        int sum =0;
        for(int i=0; i<number.length; i++){
            if(number[i]%2 != 0){
                sum += number[i];
            }
        }
        System.out.println("Sum of Odd Number is: "+sum);
    }
}