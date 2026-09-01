import java.util.Arrays;

public class SegregateDivisibleBy5_114 {
    public static void main(String[] args) {
        int arr[] = {5, 7, 10, 12, 15, 18, 20, 23};
        System.out.println(Arrays.toString(arr));
 
        segregateDivisibleBy5(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateDivisibleBy5(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isDivisibleBy5(num[left])) {
                left++;
            }
            while (left < right && !isDivisibleBy5(num[right])) {
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
 
    public static boolean isDivisibleBy5(int n) {
        return n % 5 == 0;
    }
}
