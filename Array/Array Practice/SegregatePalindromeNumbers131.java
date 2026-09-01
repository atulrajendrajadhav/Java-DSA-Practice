import java.util.Arrays;

public class SegregatePalindromeNumbers131 {
    public static void main(String[] args) {
        int arr[] = {121, 123, 1331, 456, 7, 909, 1234, 8998};
        System.out.println(Arrays.toString(arr));
 
        segregatePalindrome(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregatePalindrome(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isPalindrome(num[left])) {
                left++;
            }
            while (left < right && !isPalindrome(num[right])) {
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
 
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }
}
