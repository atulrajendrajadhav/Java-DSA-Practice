public class SumOfFrst3Ele5 {
    public static void main (String [] args) {
        int []number = {10, 20, 30, 40, 50 };
        sumOf3(number);
    }
    public static void sumOf3(int []number){
        int sum  = 0;
        for(int i=0; i<number.length; i++){
            if(i < 3){
                sum += number[i];
            }
        }
        System.out.println("Sum of 1st 3 element is: "+sum);
    }
}