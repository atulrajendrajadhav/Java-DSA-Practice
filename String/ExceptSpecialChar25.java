// WAP to print Except special character in a given String
public class ExceptSpecialChar25 {
    public static void main(String[] args) {
        String s = new String("$2 #YT@;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(!Character.isLetterOrDigit(ch)) {

                System.out.println("CH : "+ch);
            }
        }
    }
}
