import java.util.Arrays;

public class SegregateEvenOddDigitCount112 {
    public static void main(String[] args) {
        int arr[] = {5, 23, 456, 7890, 1, 78, 999, 12345};
        System.out.println(Arrays.toString(arr));
 
        segregateEvenOddDigitCount(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateEvenOddDigitCount(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isEvenDigitCount(num[left])) {
                left++;
            }
            while (left < right && !isEvenDigitCount(num[right])) {
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
 
    public static boolean isEvenDigitCount(int n) {
        return String.valueOf(Math.abs(n)).length() % 2 == 0;
    }

}
