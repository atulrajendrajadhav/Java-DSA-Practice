import java.util.Arrays;

public class SegregateAlphabetsSpecialChars121 {
    public static void main(String[] args) {
        char arr[] = {'a', '@', 'B', '#', 'c', '$', 'D', '%', 'e', '&'};
        System.out.println(Arrays.toString(arr));
 
        segregateAlphabetsSpecialChars(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateAlphabetsSpecialChars(char ch[]) {
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
