import java.util.Arrays;

public class SegregatePrimeNonPrime130 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 9, 11, 15, 17, 20, 23, 1};
        System.out.println(Arrays.toString(arr));
 
        segregatePrimeNonPrime(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregatePrimeNonPrime(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isPrime(num[left])) {
                left++;
            }
            while (left < right && !isPrime(num[right])) {
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
 
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
