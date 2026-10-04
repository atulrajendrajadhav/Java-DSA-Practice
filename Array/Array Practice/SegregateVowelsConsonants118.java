import java.util.Arrays;

public class SegregateVowelsConsonants118 {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'e', 'x', 'i', 'k', 'o', 'p', 'u', 'z'};
        System.out.println(Arrays.toString(arr));
 
        segregateVowelsConsonants(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateVowelsConsonants(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isVowel(ch[left])) {
                left++;
            }
            while (left < right && !isVowel(ch[right])) {
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
 
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
