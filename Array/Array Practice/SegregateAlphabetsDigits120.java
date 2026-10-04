import java.util.Arrays;

public class SegregateAlphabetsDigits120 {
    public static void main(String[] args) {
        char arr[] = {'a', '1', 'B', '5', 'c', '9', 'D', '0'};
        System.out.println(Arrays.toString(arr));
 
        segregateAlphabetsDigits(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateAlphabetsDigits(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isAlphabet(ch[left])) {
                left++;
            }
            while (left < right && !isAlphabet(ch[right])) {
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
 
    public static boolean isAlphabet(char c) {
        return Character.isLetter(c);
    }
}
