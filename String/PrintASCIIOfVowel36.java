// 36)WAP to print ASCII value of only vowels in a given String
public class PrintASCIIOfVowel36 {
   public static void main(String[] args) {
        String s  = new String("fyuURREAFbkioo");
        printVowel(s);
    }
    public static  void printVowel(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ||
            (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ) {

                System.out.println("CH : "+(int)ch+" = "+ch);
            }
        }
    } 
}
