import java.util.Arrays;

public class SegregateUpperLowerCase119 {
    public static void main(String[] args) {
        char arr[] = {'A', 'b', 'C', 'd', 'e', 'F', 'g', 'H'};
        System.out.println(Arrays.toString(arr));
 
        segregateUpperLowerCase(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateUpperLowerCase(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isUpperCase(ch[left])) {
                left++;
            }
            while (left < right && !isUpperCase(ch[right])) {
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
 
    public static boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }
}
