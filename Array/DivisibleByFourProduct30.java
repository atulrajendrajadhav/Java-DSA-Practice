public class DivisibleByFourProduct30 {
    public static void main ( String [] args) {
        int [] number = { 6, 12, 5, 18, 36, 7, 1};
        divisibleBy4(number);
    }
    public static void divisibleBy4(int []number){
        System.out.println("Product of numbers Divisible by 4 :  ");
        int product = 1;

        for(int i=0; i<number.length; i++){
            if(number[i]%4==0){
                product *= number[i];
            }
        }
        System.out.print(product+" ");
    }
}