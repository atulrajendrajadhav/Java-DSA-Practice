public class SumOfEvenEle3 {
    public static void main (String [] args) {
        int number[] = {10, 20, 30, 5, 3};
        sumOfEven(number);
    }
    public static void sumOfEven(int [] number){
        int sum = 0;
        for(int i=0; i<number.length; i++){
            if(number[i] % 2 == 0){
                sum += number[i];
            }
        }
        System.out.println("Sum Of all Even number is: "+sum);
    }
    
}