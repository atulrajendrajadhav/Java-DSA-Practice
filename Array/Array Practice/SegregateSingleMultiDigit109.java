import java.util.Arrays;

public class SegregateSingleMultiDigit109 {
    public static void main(String[] args) {
        int arr[] = {5, 23, 9, 456, 1, 78, 0, 999};
        System.out.println(Arrays.toString(arr));
 
        segregateSingleMultiDigit(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateSingleMultiDigit(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isSingleDigit(num[left])) {
                left++;
            }
            while (left < right && !isSingleDigit(num[right])) {
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
 
    public static boolean isSingleDigit(int n) {
        return Math.abs(n) <= 9;
    }
}
