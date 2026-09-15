// 38)WAP to print ASCII value of only Digits in a given String
public class PrintASCIIOfDigit38 {
    public static void main(String[] args) {
        String s = new String("heo6uihqs61qQAI98");
        printDigti(s);
    }
    public static  void printDigti(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if(ch>='0' && ch<='9'){
            System.out.println("ch: "+(int)ch+" = "+ch);
            }
        }
    }

}
