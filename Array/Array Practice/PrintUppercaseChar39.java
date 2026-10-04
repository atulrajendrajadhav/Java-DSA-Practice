// WAP to print only Uppercase character from char[] 
public class PrintUppercaseChar39 {
    public static void main(String[] args) {
        char arr[] =  {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7', 'Z'}; 
        printUppercase(arr);
    }
    public static void printUppercase(char [] arr) {
        System.out.println("Upper case Char is: ");
        for(int i=0; i<arr.length; i++){
            if (arr[i]>='A' && arr[i]<='Z') {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
