//  WAP to create new Array and store all Palindrome number in an an new array from existing array 
public class StorePalindromeNumber85 {
    public static void main(String[] args) {
        int num[] = { 121, 1234, 1331, 222, 987, 5665 };
        int count = countPalindrome(num);  // call count method

        int result[] = printPalindrome(num, count); // call print new array method
        System.out.println("New Palindrome Array is: ");
        
        for(int i=0; i<result.length; i++){ // print the new Array
            System.out.print(result[i]+" ");
        }
    }

    // the method which create new palindrome array and return new Array
    public static int[] printPalindrome(int num[], int count){
        int result[] = new int[count];
        int index =0;

        for(int i=0; i<num.length; i++) {
            if(isPalindrome(num[i])){
                result[index] = num[i];
                index ++;
            }
        }
        return result;
    }

    // method to count palindeome values
    public static int countPalindrome(int[] num) {
        int count = 0;
        for(int i=0; i<num.length; i++){
            if(isPalindrome(num[i])){
                count ++;
            }
        }
        return count ;
    }

    // method to find palindrome 
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int temp = 0;
        int reverse = 0;

        while (num != 0) {
            temp = num % 10;
            num = num / 10;

            reverse = (reverse * 10) + temp;
        }
        //System.out.println(reverse);
        return originalNum == reverse;
    }
}
