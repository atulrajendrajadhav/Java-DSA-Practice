public class PrintDivisibleByThree25 {
    public static void main ( String [] args) {
        int [] number = { 6, 2, 5, 18, 36, 7, 1};
        divisibleBy3(number);
    }
    public static void divisibleBy3(int []number){
        System.out.println("Num of Divisible by 3:  ");
        
        for(int i=0; i<number.length; i++){
            if(number[i]%3==0){
                System.out.print(number[i]+" ");
            }
        }
    }
}