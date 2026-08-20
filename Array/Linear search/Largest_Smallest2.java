import java.util.Scanner;

public class Largest_Smallest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[6];
        
        System.out.println("Enter the Array: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        getLarg_Small(numbers);

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
        sc.close();
    }
    public static void getLarg_Small(int number[]){
        // Largest --Store small Value campare 
        // Smallest --Store Big Value to campare 
        int largest = Integer.MIN_VALUE; // -Infinity 
        int smallest = Integer.MAX_VALUE; // +Infinity

        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        System.out.print("\nSmallest number in given array is:  "+smallest);
        System.out.println("\nLargest number in Given array is:  "+largest);
    }
}
