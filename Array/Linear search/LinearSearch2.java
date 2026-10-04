// Linear search with user input 
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array declaration 
        int[] numbers = {10, 20, 30, 40, 50, 60};
       
        //before array update print array
        System.out.print("Given Array is: "+Arrays.toString(numbers));
        System.out.print("\nEnter the target value: ");
        int target = sc.nextInt();

        //Call method 
        int result = lnearSearch(numbers, target);


        if(result == -1){
            System.out.println("Number is not found");
        }
        else
            System.out.println("Number is found at index: "+result);

        //After updation array is 
        System.out.println("After updation array is: "+Arrays.toString(numbers));
        sc.close();
    }
    public static int lnearSearch(int []numbers, int target){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == target){
                numbers[i] = numbers[i]+ 100;
                return i;
            }
        }
        return -1;
    }
}
