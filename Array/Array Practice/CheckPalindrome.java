import java.util.Arrays;

public class CheckPalindrome {
    public static void main (String[] a) {
        int []num  = {121, 43, 83, 1331, 1818, 9889, 555};

        System.out.println(Arrays.toString(num));
        SegrePalindrome(num);
        System.out.println(Arrays.toString(num));

    }

    public static void SegrePalindrome (int num[]){
        int left  = 0;
        int right  = num.length - 1;

        while (left < right ){
            while(left < right && isPalindrome(num[left])){
                left ++;
            }
            while (left < right && !isPalindrome(num[right])) {
                right --;
            }
            
            if(left < right) {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;

                left ++;
                right --;
            }
        }
    }
    public static boolean isPalindrome(int num) {
        int  originalNum = num;
        int temp =0;
        int reversed = 0;

        while(num != 0){
            temp = num % 10;
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        return originalNum == reversed;
    }
}