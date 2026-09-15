// 3)WAP to print only upper case character in given String 
public class PrintUpperCaseChar3 {
    public static void main(String[] args) {
        String s  = new String("HEllow JaVa");
        printUppeCase(s);
    }
    public static void printUppeCase(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch<= 'Z'){
                System.out.println("ch: "+ch);
            }
        }
    }
}