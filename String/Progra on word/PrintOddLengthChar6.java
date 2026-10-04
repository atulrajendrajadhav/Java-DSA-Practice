// Print each world whose length is odd 
public class PrintOddLengthChar6 {

    public static void main(String[] args) {
        String s = "Java is high level, platform independant, Object oriyented programming langauge hii";
        printOddChar(s);
    }
    public static  void printOddChar(String s) {
        s = s +" ";
        String res  = "";

        for(int i=0; i<s.length(); i++) {
            char ch  = s.charAt(i);

            if(ch != ' ') {
                res = res+ch;
            }
            else {
                if(res.length()%2 !=0){
                    System.out.println(res);
                   
                }
                 res = "";
            }
        }
    }
}