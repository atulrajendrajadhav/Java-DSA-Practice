import java.util.Arrays;

public class SegregateSunny106 {
    public static void main(String[] args) {
        int arr[] = {3, 8, 15, 24, 10, 35, 48, 5};
        System.out.println(Arrays.toString(arr));
 
        segregateSunny(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateSunny(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isSunny(num[left])) {
                left++;
            }
            while (left < right && !isSunny(num[right])) {
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
 
    public static boolean isSunny(int n) {
        double sqrt = Math.sqrt(n + 1);
        return sqrt == Math.floor(sqrt);
    }
}
