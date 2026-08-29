// .WAP to print only alphabet character from char[] 
public class PrintAlphabetChar42 {
    public static void main(String[] args) {
        char arr[] =  {'A', 'b','*', 'e', '#', 'I', 'm', 'o', 'P', '$', 'u', '7', 'Z', '@'}; 
        PrintAlphabetChar(arr);
    }
    public static void PrintAlphabetChar(char [] arr) {
        System.out.println("Alphabet Char is: ");
        for(int i=0; i<arr.length; i++){
            if ((arr[i]>='A' && arr[i]<='Z') || (arr[i]>='a' && arr[i]<='z')) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
