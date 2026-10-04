import java.util.Arrays;

public class SegregateNeon107 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 5, 8, 3, 7, 10};
        System.out.println(Arrays.toString(arr));
 
        segregateNeon(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateNeon(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isNeon(num[left])) {
                left++;
            }
            while (left < right && !isNeon(num[right])) {
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
 
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }
}
