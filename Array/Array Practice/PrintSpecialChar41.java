// WAP to print only Special character from char[] 
public class PrintSpecialChar41 {
    public static void main(String[] args) {
        char arr[] =  {'A', 'b','*', 'e', '#', 'I', 'm', 'o', 'P', '$', 'u', '7', 'Z', '@'}; 
        PrintSpecialChar(arr);
    }
    public static void PrintSpecialChar(char [] arr) {
        System.out.println("Special Char is: ");
        for(int i=0; i<arr.length; i++){
            if (arr[i]>=32 && arr[i]<=47) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
