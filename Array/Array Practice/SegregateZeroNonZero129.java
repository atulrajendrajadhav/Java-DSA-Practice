import java.util.Arrays;

public class SegregateZeroNonZero129 {
     public static void main(String[] args) {
        int arr[] = {0, 5, 0, -3, 8, 0, 9, 0, 4, -2};
        System.out.println(Arrays.toString(arr));
 
        segregateZeroNonZero(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateZeroNonZero(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isZero(num[left])) {
                left++;
            }
            while (left < right && !isZero(num[right])) {
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
 
    public static boolean isZero(int n) {
        return n == 0;
    }

}
