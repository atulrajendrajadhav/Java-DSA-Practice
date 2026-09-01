import java.util.Arrays;

public class SegregatePositiveNegative128 {
    public static void main(String[] args) {
        int arr[] = {3, -4, 8, -6, 7, 2, -2, -1, 9};
        System.out.println(Arrays.toString(arr));
 
        segregatePositiveNegative(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregatePositiveNegative(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isPositive(num[left])) {
                left++;
            }
            while (left < right && !isPositive(num[right])) {
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
 
    public static boolean isPositive(int n) {
        return n >= 0;
    }
}
