public class SumOfNegativeEle8 {
    public static void main(String [] args) {
        int number[] = {-10, 20, -30, 40, -50};
        sumOfNegative(number);

    }
    public static void sumOfNegative(int []number) {
        int sum = 0;
        for(int i=0; i<number.length; i++){
            if(number[i] <= 0){
                sum += number[i];
            }
        }
        System.out.println("Sum od negative number is: "+sum);
    }
}