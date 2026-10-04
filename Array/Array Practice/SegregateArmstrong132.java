import java.util.Arrays;

public class SegregateArmstrong132 {
    public static void main(String[] args) {
        int arr[] = {153, 123, 370, 9474, 100, 371, 407, 55};
        System.out.println(Arrays.toString(arr));
 
        segregateArmstrong(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateArmstrong(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isArmstrong(num[left])) {
                left++;
            }
            while (left < right && !isArmstrong(num[right])) {
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
 
    public static boolean isArmstrong(int n) {
        int original = n, digits = String.valueOf(n).length(), sum = 0;
        while (n != 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n /= 10;
        }
        return sum == original;
    }
}
