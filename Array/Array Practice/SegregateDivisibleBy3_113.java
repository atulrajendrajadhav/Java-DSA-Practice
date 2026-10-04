import java.util.Arrays;

public class SegregateDivisibleBy3_113 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 10, 12, 17, 21, 22};
        System.out.println(Arrays.toString(arr));
 
        segregateDivisibleBy3(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateDivisibleBy3(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isDivisibleBy3(num[left])) {
                left++;
            }
            while (left < right && !isDivisibleBy3(num[right])) {
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
 
    public static boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }
}
