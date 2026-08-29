public class PrintDivisibleByFour26 {
    public static void main ( String [] args) {
        int [] number = { 16, 12, 5, 18, 36, 7, 1};
        divisibleBy4(number);
    }
    public static void divisibleBy4(int []number){
        System.out.println("Num of Divisible by 4:  ");
        
        for(int i=0; i<number.length; i++){
            if(number[i]%3==0){
                System.out.print(number[i]+" ");
            }
        }
    }
}