// 4. Print each world length  
public class PrintEachWordLength4 {

    public static void main(String[] args) {
        String s = "java is hight level, platform independant langauge";
        printLength(s);
    }
    public static  void printLength(String s) {
        s = s+" ";
        String res = "";
        int count = 0;

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                res = res + ch;
               
            } 
            else
            {
                System.out.println(res +" Length is: "+res.length());
                res = "";
                 count ++;
            }
        }
        System.out.println("Total word is: "+count);
    }
}