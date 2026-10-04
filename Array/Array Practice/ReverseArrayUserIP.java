import java.util.Scanner;
public class ReverseArrayUserIP {
    public static void main ( String [] arg){
      Scanner sc = new Scanner(System.in);
    
      int numbers[] = new int[6]; // Arrya Declaration 

      //Loop to Array input 
      System.out.println("Enter the 6 lenth Array: ");
      for(int i=0; i<numbers.length; i++){
        numbers[i] = sc.nextInt();
      }

      getReverse(numbers); // method call 

      //Loop to print reverse Array
      System.out.println("Reverse Array is: ");
      for(int i = 0; i<numbers.length; i++){
        System.out.print(numbers[i]+" ");
        sc.close();
      }
    }
    public static void getReverse(int numbers[]){
        int start = 0;
        int end = numbers.length -1;

        while (start < end) {
            //Swap array using temp third variable 
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start ++;
            end --;

        }
    }
}
