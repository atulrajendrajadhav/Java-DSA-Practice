 //WAP to create char[] and store character from user and print it on console
import java.util.Scanner;

public class CharArrayInput36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array size: ");
        int size = sc.nextInt();

        char[] arr = new char[size];
        // loop for input
        System.out.println("Enter the Array: ");
        for (char i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(arr[i]);
        }

        // Print Array
        System.out.println("Array is:");
        for (char i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}