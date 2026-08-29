// WAP to print data which are divisible by 3 or 4 from integer array 
public class DivisibleBy3and4InIntArray75 {
  public static void main(String[] args) {
        int []number = {12, 10, 16, 33, 40, 84, 9, 5, 22};
        divisibleBy3And4(number);
    }
    public static void divisibleBy3And4(int []number){
        System.out.println("Element in given Array which is Divisible by 4 And 3: ");
        for(int i=0; i<number.length; i++){
            if(number[i]%3==0 && number[i]%4==0){
                System.out.print(number[i]+" ");
            }
        }
    }  
}
