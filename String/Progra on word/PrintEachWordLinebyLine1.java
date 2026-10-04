// 1. Print each world line by line 
public class PrintEachWordLinebyLine1 {
    public static void main (String [] srgs) {
        String s = "java is hight level, platform independant langauge";
        printWord(s);
    }

    public static void printWord(String s) {
        s = s+" ";
        
        String res = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                res  = res+ch;
            }
            else {
                System.out.println(res);
                res = "";
            }
        
        }
    }
}