// WAP to print only digits from char[] 
public class PrintDigitChar43 {
    public static void main(String[] args) {
        char arr[] =   {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'}; 
        PrintDigitChar(arr);
    }
    public static void PrintDigitChar(char [] arr) {
        System.out.println("Digit in given Array  is: ");
        for(int i=0; i<arr.length; i++){
            if (arr[i]>=  47 && arr[i]<=58) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
