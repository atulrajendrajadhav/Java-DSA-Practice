import java.util.Arrays;

public class SegregateSpy105  {
      public static void main(String[] args) {
        int arr[] = {1124, 123, 22, 4, 1112, 9, 132, 44};
        System.out.println(Arrays.toString(arr));
 
        segregateSpy(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateSpy(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isSpy(num[left])) {
                left++;
            }
            while (left < right && !isSpy(num[right])) {
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
 
    public static boolean isSpy(int n) {
        int sum = 0, product = 1, temp = n;
        while (temp != 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }
}
