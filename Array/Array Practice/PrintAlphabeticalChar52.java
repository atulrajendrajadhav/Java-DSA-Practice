// WAP to print alphabetical character index from char[] 

public class PrintAlphabeticalChar52 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'};
        alphabeticalChar(ch);
    }

    public static void alphabeticalChar(char []ch) {
        System.out.println("Alphabetical char index is: ");
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i]<='z') {
                System.out.print(ch[i]+" = "+i+", ");
            }
        }
    }
}
