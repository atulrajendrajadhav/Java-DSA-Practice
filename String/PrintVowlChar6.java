// WAP to print only vowels in a given String
public class PrintVowlChar6 {
    public static void main(String[] args) {
        String s  = new String("fyuURREAFbkioo");
        printVowel(s);
    }
    public static  void printVowel(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ||
            (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') ) {

                System.out.println("CH : "+ch);
            }
        }
    }
}
