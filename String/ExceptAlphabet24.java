// 24)WAP to print Except Alphabets in a given String
public class ExceptAlphabet24 {
    public static void main(String[] args) {
        String s = new String("iohB685855o9JO^FTT;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(!Character.isAlphabetic(ch)) {

                System.out.println("CH : "+ch);
            }
        }
    }
}