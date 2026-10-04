public class SumOfPositiveEle7 {
    public static void main ( String [] args) {
        int [] number = { -10, 20, -30, 40, 50};
        sumOfPositive(number);
    }
    public static void sumOfPositive (int []number){
        int sum =0;
        for(int i=0; i<number.length; i++){
            if(number[i]>=0){
                sum += number[i];
            }
        }
        System.out.println("Sum of all Positive number is: "+sum);
    }
}