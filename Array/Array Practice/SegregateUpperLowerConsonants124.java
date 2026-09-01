import java.util.Arrays;

public class SegregateUpperLowerConsonants124 {
    public static void main(String[] args) {
        char arr[] = {'B', 'c', 'D', 'f', 'G', 'h', 'K', 'm', 'N', 'p'};
        System.out.println(Arrays.toString(arr));
 
        segregateUpperLowerConsonants(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateUpperLowerConsonants(char ch[]) {
        int left = 0;
        int right = ch.length - 1;
 
        while (left < right) {
 
            while (left < right && isUpperConsonant(ch[left])) {
                left++;
            }
            while (left < right && !isUpperConsonant(ch[right])) {
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
 
    public static boolean isUpperConsonant(char c) {
        String vowels = "AEIOUaeiou";
        return Character.isUpperCase(c) && Character.isLetter(c) && vowels.indexOf(c) == -1;
    }
}
