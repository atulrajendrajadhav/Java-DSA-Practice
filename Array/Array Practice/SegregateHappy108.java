import java.util.Arrays;

public class SegregateHappy108 {
    public static void main(String[] args) {
        int arr[] = {1, 7, 19, 4, 23, 2, 10, 13};
        System.out.println(Arrays.toString(arr));
 
        segregateHappy(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateHappy(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isHappy(num[left])) {
                left++;
            }
            while (left < right && !isHappy(num[right])) {
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
 
    public static boolean isHappy(int n) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
