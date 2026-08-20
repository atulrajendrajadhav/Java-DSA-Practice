import java.util.Arrays;

public class Largest_Smallest1 {
   public static void main(String[] args) {
      int [] numbers = {3, 5, 7, 12, 14, 17, 20, 30};
      //print given array
      
       System.out.println(Arrays.toString(numbers));
      getLaeg_Small(numbers);
   } 
   public static void getLaeg_Small(int []numbers){
      int largest = Integer.MIN_VALUE; // -Infinity
      int smallest = Integer.MAX_VALUE;// +Infinity

      for(int i=0; i<numbers.length; i++){
         // Condition to find largest number
         if(largest < numbers[i]){
            largest = numbers[i];
         }
         // Condition to find Smallest number
         if(smallest > numbers[i]){
            smallest = numbers[i];
         }
      }
      System.out.println("Largest number in given arrya is: "+largest);
      System.out.println("Smallest number in given array is: "+smallest);
   }
}
