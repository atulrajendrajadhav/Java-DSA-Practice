import java.util.Scanner;

public class BinarySearchEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Array input loop
        System.out.println("Enter the Sorted Array 5 lengh: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // Given the target value
        System.out.print("\nEnter the Target: ");
        int Target = sc.nextInt();

        // Call the method
        int result = getBinarySearch(numbers, 0);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found ");
        }
    }

    // Method to find mid
    public static int getBinarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (target > numbers[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
