import java.util.Arrays;

public class SegregateDigitsSpecialChars122 {
    public static void main(String[] args) {
        char arr[] = {'3', '@', '5', '#', '7', '$', '2', '%', '9', '&'};
        System.out.println(Arrays.toString(arr));
 
        segregateDigitsSpecialChars(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateDigitsSpecialChars(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isDigit(ch[left])) {
                left++;
            }
            while (left < right && !isDigit(ch[right])) {
                right--;
            }
 
            if (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
 
                left++;
                right--;
            }
        }
    }
 
    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }
}
