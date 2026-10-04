// WAP to print only lowercase character from char[] 
public class PrintLowercaseChar40 {
    public static void main(String[] args) {
        char arr[] =  {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7', 'Z'}; 
        printLowercase(arr);
    }
    public static void printLowercase(char [] arr) {
        System.out.println("Lower case Char is: ");
        for(int i=0; i<arr.length; i++){
            if (arr[i]>='a' && arr[i]<='z') {
                System.out.print(arr[i]+" ");
            }
        }
    }
}


