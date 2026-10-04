import java.util.Arrays;

public class SegregateLeapYears117 {
    public static void main(String[] args) {
        int arr[] = {2000, 2001, 2020, 1900, 2024, 2023, 2100, 2400};
        System.out.println(Arrays.toString(arr));
 
        segregateLeapYears(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateLeapYears(int num[]) {
        int left = 0;
        int right = num.length - 1;
 
        while (left < right) {
 
            while (left < right && isLeapYear(num[left])) {
                left++;
            }
            while (left < right && !isLeapYear(num[right])) {
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
 
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
