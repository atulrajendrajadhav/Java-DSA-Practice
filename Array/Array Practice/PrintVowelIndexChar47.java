// WAP to print vowel character index from char[]
public class PrintVowelIndexChar47 {
    public static void main(String[] args) {
        char[]arr = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        vowelIndexChar(arr);
    }
    public static void vowelIndexChar(char arr[]){
        System.out.println("Vowel index char is ");
        for(int i=0; i<arr.length; i++){
            if ((arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
                || 
                (arr[i]=='A' || arr[i]=='E'|| arr[i]=='I' || arr[i]=='O' || arr[i]=='U')) 
            {
                System.out.print(i+" ");
            }
        }
    }
}
