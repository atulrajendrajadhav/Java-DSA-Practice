// WAP to product of value which are divisible by both 3&4 from integer array
public class ProductOfDivisibleBy3Or4_78 {
     public static void main(String[] args) {
        int []number = {12, 10, 16, 33, 40, 84, 9, 5, 22};
        proDivisibleBy3Or4(number);
    }
    public static void proDivisibleBy3Or4(int []number){
        int pro = 1;
        System.out.println("Element in given Array which is Divisible by 4 Or 3: ");
        for(int i=0; i<number.length; i++){
            if(number[i]%3==0 || number[i]%4==0){
                System.out.print(number[i]+" ");
                pro *= number[i];
            }
        }
        System.out.println("\n Product Which is Divisible By 3 Or 4: "+pro);
    }
}   

