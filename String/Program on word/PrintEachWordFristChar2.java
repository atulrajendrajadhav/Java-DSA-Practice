// 2. Print each world first character  
public class PrintEachWordFristChar2 {
    public static void main(String[] args) {
        String s = " Java is High level platform independant";
        printFristChar(s);
    }
    public static void printFristChar(String s) {

        s = ' '+s;
        // String res = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ') {
                System.out.println(s.charAt(i+1)); 
            }
            else {
               continue;
            }
        }
    }

}