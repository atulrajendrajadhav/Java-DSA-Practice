//13.WAP to print uppercase character index from char[] 

public class PrintUpperCaseChar49 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        printUpperCaseChar(ch);
    }

    public static void printUpperCaseChar(char []ch) {
        System.out.println("Upper case char index is: ");
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i]<='Z') {
                System.out.print(ch[i]+" = "+i+", ");
            }
        }
    }
}
