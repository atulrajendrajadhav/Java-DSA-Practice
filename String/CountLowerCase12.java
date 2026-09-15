// 12)WAP to count only lowercase character in a given String 
public class CountLowerCase12 {
    public static void main(String[] args) {
        String s = new String("Hellow jAVa");
        printLowerCase(s);

    }
    public static  void printLowerCase(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
               count ++;
            }
        }
        System.out.println("Count: "+count);
    }
}
