import java.util.Arrays;

public class SegregateDivisibleBy7_115 {
    public static void main(String[] args) {
        int arr[] = {7, 9, 14, 20, 21, 30, 35, 40};
        System.out.println(Arrays.toString(arr));
 
        segregateDivisibleBy7(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateDivisibleBy7(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isDivisibleBy7(num[left])) {
                left++;
            }
            while (left < right && !isDivisibleBy7(num[right])) {
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
 
    public static boolean isDivisibleBy7(int n) {
        return n % 7 == 0;
    }
}
