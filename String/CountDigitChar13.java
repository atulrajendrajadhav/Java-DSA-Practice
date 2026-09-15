// 13)WAP to count only Digits character in a given String 
public class CountDigitChar13 {
    public static void main(String[] args) {
        String s = new String("heo6uihqs61qQAI98");
        printDigti(s);
    }
    public static  void printDigti(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if(ch>='0' && ch<='9'){
           count ++;
            }
        }
        System.out.println("COUNT IS: "+count);
    }
}
