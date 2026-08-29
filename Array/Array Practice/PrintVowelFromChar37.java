// WAP to print only vowels from char[]
public class PrintVowelFromChar37 {
    public static void main(String[] args) {
        char[] arr = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
        printVowel(arr);
    }
    public static void printVowel(char[] arr){
        System.out.println("Vowl is: ");
        for(int i=0; i<arr.length; i++){
            if ((arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
                || (arr[i]=='A' || arr[i]=='E'|| arr[i]=='I' || arr[i]=='O' || arr[i]=='U')) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
