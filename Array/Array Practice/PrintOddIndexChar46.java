// WAP to print odd index character from char[]
public class PrintOddIndexChar46 {
    public static void main(String[] args) {
        char[]arr = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        oddIndexChar(arr);
    }
    public static void oddIndexChar(char ch[]){
        System.out.println("Odd index char is ");
        for(int i=0; i<ch.length; i++){
            if (i%2 != 0) {
                System.out.print(ch[i]+" ");
            }
        }
    }
}
