// 35)WAP to print ASCII value of every character in a given String 
public class PrintASCIIValue35 {
    public static void main(String[] args) {
        String s  = new String("JAVA ");
        printChar(s);
    }
    public static void printChar(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            System.out.println("CH: "+(int)ch+" = "+ch);
        }
    }
}
