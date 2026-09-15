// 15)WAP to count only consonants in a given String 
public class CountConsonatChar15 {
     public static void main(String[] args) {
        String s = new String("iohBo9JO^FTT;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if((ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u')&&
            (ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') ) {

                //System.out.println("CH : "+ch);
                count ++;
            }
        }
        System.out.println("Count: "+count);
    }

}
