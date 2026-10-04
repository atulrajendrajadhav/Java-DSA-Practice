import java.util.Arrays;

public class SegregatePerfect102 {
    public static void main(String[] args) {
        int arr[] = {6, 10, 28, 12, 496, 100, 8128, 15};
        System.out.println(Arrays.toString(arr));
 
        segregatePerfect(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregatePerfect(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isPerfect(num[left])) {
                left++;
            }
            while (left < right && !isPerfect(num[right])) {
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
 
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum == n;
    }
}
