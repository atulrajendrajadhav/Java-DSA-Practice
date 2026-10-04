// 8. Print count of worlds 
public class PrintCountOfWord8 {
    public static void main(String[] args) {
        String s = "Java is high level, platform independant, Object oriyented programming langauge";
        printWordCount(s);
    }

    public static  void printWordCount(String s) {
        s = s+" ";
       String res = "";
       int count = 0;

       for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i); 

            if(ch != ' ') {
                res = res + ch;
            }
            else {
                System.out.println(res);
                res = "";
                count ++;
            }
       }
       System.out.println("Total word is: "+count);

    }
}