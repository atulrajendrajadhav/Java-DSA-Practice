import java.util.Arrays;

public class SegregateLettersNonLetters125 {
    public static void main(String[] args) {
        char arr[] = {'a', '1', 'B', '@', 'c', '5', '#', 'D', ' ', '9'};
        System.out.println(Arrays.toString(arr));
 
        segregateLettersNonLetters(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateLettersNonLetters(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isLetter(ch[left])) {
                left++;
            }
            while (left < right && !isLetter(ch[right])) {
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
 
    public static boolean isLetter(char c) {
        return Character.isLetter(c);
    }
}
