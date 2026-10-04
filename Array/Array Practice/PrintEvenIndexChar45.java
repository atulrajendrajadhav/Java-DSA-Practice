//WAP to print even index character from char[] 
 
public class PrintEvenIndexChar45 {
    public static void main(String[] args) {
        char[]arr = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        evenIndexChar(arr);
    }
    public static void evenIndexChar(char ch[]){
        System.out.println("Even index char is ");
        for(int i=0; i<ch.length; i++){
            if (i%2 == 0) {
                System.out.print(ch[i]+" ");
            }
        }
    }
}
