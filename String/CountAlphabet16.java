// 16)WAP to count only Alphabets in a given String 
public class CountAlphabet16 {
     public static void main(String[] args) {
        String s = new String("iohB685855o9JO^FTT;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {

                //System.out.println("CH : "+ch);
                count ++;
            }
        }
        System.out.println("Count is: " + count);
    }

}
