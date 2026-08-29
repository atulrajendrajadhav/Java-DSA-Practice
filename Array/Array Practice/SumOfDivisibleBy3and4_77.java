// WAP to sum of value which are divisible by 3 or 4 from integer array 
public class SumOfDivisibleBy3and4_77 {
    public static void main(String[] args) {
        int []number = {12, 10, 16, 33, 40, 84, 9, 5, 22};
        sumDivisibleBy3And4(number);
    }
    public static void sumDivisibleBy3And4(int []number){
        int sum = 0;
        System.out.println("Element in given Array which is Divisible by 4 and 3: ");
        for(int i=0; i<number.length; i++){
            if(number[i]%3==0 && number[i]%4==0){
                System.out.print(number[i]+" ");
                sum+=number[i];
            }
        }
        System.out.println("\n Sum Which is Divisible By 3 and 4: "+sum);
    }
}
