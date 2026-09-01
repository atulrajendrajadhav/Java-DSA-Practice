import java.util.Arrays;

public class SegregateTech104 {
    public static void main(String[] args) {
        int arr[] = {2025, 81, 3025, 1234, 9801, 100, 2916, 45};
        System.out.println(Arrays.toString(arr));
 
        segregateTech(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateTech(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isTech(num[left])) {
                left++;
            }
            while (left < right && !isTech(num[right])) {
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
 
    public static boolean isTech(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        if (len % 2 != 0) return false;
        int half = len / 2;
        int left = Integer.parseInt(s.substring(0, half));
        int right = Integer.parseInt(s.substring(half));
        int sum = left + right;
        return (long) sum * sum == n;
    }
}
