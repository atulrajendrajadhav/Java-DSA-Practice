// 31)WAP to print only consonants index in a given String
public class PrintConsonatIndex31 {
   public static void main(String[] args) {
        String s = new String("iohBo9JO^FTT;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if((ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')&&
            (ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') ) {

                System.out.println("CH : "+ch+" index: "+i);
            }
        }
    } 
}
