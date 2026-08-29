public class SumOfLast3Ele6 {
    public static void main (String [] args){
        int[] number = {10, 20, 30, 40, 50};
        sumOfLast3(number);
    }
    public static void sumOfLast3(int number[]){
        int sum = 0;
        for(int i=number.length-1; i>=0; i--){
            if(i>=2){
                sum += number[i];
            }
        }
        System.out.println("Sum of last 3 is: "+sum);
    }
}