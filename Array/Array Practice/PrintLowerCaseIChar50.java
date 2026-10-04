// WAP to print lowercase character index from char[] 

public class PrintLowerCaseIChar50 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        printLowerCaseChar(ch);
    }

    public static void printLowerCaseChar(char []ch) {
        System.out.println("Lower case char index is: ");
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z') {
                System.out.print(ch[i]+" = "+i+", ");
            }
        }
    }
}
