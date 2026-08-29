public class DivisibleByThreeProduct29 {
    public static void main ( String [] args) {
        int [] number = { 6, 2, 5, 18, 36, 7, 1};
        divisibleBy3(number);
    }
    public static void divisibleBy3(int []number){
        System.out.println("Product of numbers Divisible by 3:  ");
        int product = 1;

        for(int i=0; i<number.length; i++){
            if(number[i]%3==0){
                product *= number[i];
            }
        }
        System.out.print(product+" ");
    }
}