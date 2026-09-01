import java.util.Arrays;

public class SegregateTwoThreeDigit111 {
    public static void main(String[] args) {
        int arr[] = {23, 456, 78, 999, 45, 12, 100, 34};
        System.out.println(Arrays.toString(arr));
 
        segregateTwoThreeDigit(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateTwoThreeDigit(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isTwoDigit(num[left])) {
                left++;
            }
            while (left < right && !isTwoDigit(num[right])) {
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
 
    public static boolean isTwoDigit(int n) {
        return String.valueOf(Math.abs(n)).length() == 2;
    }
}
