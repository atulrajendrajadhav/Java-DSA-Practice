// 18)WAP to iterate String from last to first and print 
public class IterateStringLastToFrist18 {
    public static void main(String[] args) {
        String s  = new String("JAVA ");
        iterateString(s);
        
    }
    public static  void  iterateString(String s){
        for(int i=s.length()-1; i>=0; i--){
           char ch = s.charAt(i);
           System.out.println(ch);
        }
    }
}
