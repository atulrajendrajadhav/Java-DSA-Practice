public class DivisibleByThreeSum27 {
    public static void main ( String [] args) {
        int [] number = { 6, 2, 5, 18, 36, 7, 1};
        divisibleBy3(number);
    }
    public static void divisibleBy3(int []number){
        System.out.println("Sum of numbers Divisible by 3:  ");
        int sum = 0;

        for(int i=0; i<number.length; i++){
            if(number[i]%3==0){
                sum += number[i];
            }
        }
        System.out.print(sum+" ");
    }
}