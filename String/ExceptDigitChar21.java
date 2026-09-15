// 21)WAP to print Except Digits character in a given String
public class ExceptDigitChar21 {
    public static void main(String[] args) {
        String s = new String("heo6uihqs61qQAI98");
        printDigti(s);
    }
    public static  void printDigti(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if(!Character.isDigit(ch)){
            System.out.println("ch: "+ch);
            }
        }
    }
}
