public class DivisibleByFourSum28 {
    public static void main ( String [] args) {
        int [] number = { 16, 12, 5, 18, 36, 7, 1};
        divisibleBy3(number);
    }
    public static void divisibleBy3(int []number){
        System.out.println("Sum of numbers Divisible by 4:  ");
        int sum = 0;

        for(int i=0; i<number.length; i++){
            if(number[i]%4==0){
                sum += number[i];
            }
        }
        System.out.print(sum+" ");
    }
}