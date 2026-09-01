import java.util.Arrays;

public class SegregateMultiplesOf10_116 {
    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 23, 30, 45, 100, 99};
        System.out.println(Arrays.toString(arr));
 
        segregateMultiplesOf10(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateMultiplesOf10(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isMultipleOf10(num[left])) {
                left++;
            }
            while (left < right && !isMultipleOf10(num[right])) {
                right--;
            }
 
            if (left < right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
 
                left++;
                right--;
            }
        }
    }
 
    public static boolean isMultipleOf10(int n) {
        return n % 10 == 0;
    }
}
