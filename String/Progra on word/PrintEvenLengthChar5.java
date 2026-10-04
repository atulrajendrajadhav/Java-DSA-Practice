// Print each world whose length is even 
public class PrintEvenLengthChar5 {
    public static void main(String[] args) {
         String s = "java is hight level, platform independant langauge hii";
        printEvenChar(s);

    }
    public  static void printEvenChar(String s) {
        s = s+" ";
        String res = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch != ' ') {
               res = res+ch;
            }
            else {
                if(res.length()%2 == 0) {
                    System.out.println(res);
                }
                res = "";

            }
        }
    }
}
