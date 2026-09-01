import java.util.Arrays;

public class SegregateUpperLowerVowels123 {
    public static void main(String[] args) {
        char arr[] = {'A', 'e', 'I', 'o', 'U', 'a', 'E', 'i', 'O', 'u'};
        System.out.println(Arrays.toString(arr));
 
        segregateUpperLowerVowels(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateUpperLowerVowels(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isUpperVowel(ch[left])) {
                left++;
            }
            while (left < right && !isUpperVowel(ch[right])) {
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
 
    public static boolean isUpperVowel(char c) {
        String vowels = "AEIOU";
        return Character.isUpperCase(c) && vowels.indexOf(c) != -1;
    }
}
