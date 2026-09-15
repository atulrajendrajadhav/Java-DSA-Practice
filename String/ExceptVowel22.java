// 22)WAP to print Except vowels in a given String
public class ExceptVowel22 {
    public static void main(String[] args) {
        String s  = new String("fyuURREAFbkioo");
        printVowel(s);
    }
    public static  void printVowel(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            if((ch!='A'&& ch!='E'&& ch!='I'&& ch!='O'&& ch!='U')&&
            (ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') ) {

                System.out.println("CH : "+ch);
            }
        }
    }
}
