// 37)WAP to print ASCII value of only consonants in a given String
public class PrintASCIIOfConsonat37 {
     public static void main(String[] args) {
        String s = new String("iohBo9JO^FTT;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if((ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')&&
            (ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') ) {

                System.out.println("CH : "+(int)ch+" = "+ch);
            }
        }
    }
}
