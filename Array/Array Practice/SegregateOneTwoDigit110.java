import java.util.Arrays;

public class SegregateOneTwoDigit110 {
    public static void main(String[] args) {
        int arr[] = {5, 23, 9, 45, 1, 78, 6, 99};
        System.out.println(Arrays.toString(arr));
 
        segregateOneTwoDigit(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateOneTwoDigit(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isOneDigit(num[left])) {
                left++;
            }
            while (left < right && !isOneDigit(num[right])) {
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
 
    public static boolean isOneDigit(int n) {
        return String.valueOf(Math.abs(n)).length() == 1;
    }
}
