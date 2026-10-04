// WAP to print special character index from char[] 

public class PrintSpecialCharIndex51 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        PrintSpecialCharInd(ch);
    }

    public static void PrintSpecialCharInd(char []ch) {
        System.out.println("Special char index is: ");
        for(int i=0; i<ch.length; i++){
            if(ch[i]>=33 && ch[i]<=64) {
                System.out.print(ch[i]+" = "+i+", ");
            }
        }
    }
}
