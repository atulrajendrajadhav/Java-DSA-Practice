import java.util.Arrays;
class SegregateBuzz102 {
    public static void main(String[] args) {
        int arr[] = {14, 17, 21, 27, 30, 47, 49, 50};
        System.out.println(Arrays.toString(arr));
 
        segregateBuzz(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateBuzz(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isBuzz(num[left])) {
                left++;
            }
            while (left < right && !isBuzz(num[right])) {
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
 
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }
}