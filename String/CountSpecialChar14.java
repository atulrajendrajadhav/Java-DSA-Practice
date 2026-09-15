// 14)WAP to count only vowels in a given String 
public class CountSpecialChar14 {
     public static void main(String[] args) {
        String s = new String("$2 #YT@;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(ch>=33 && ch<=47 || ch>=59 && ch<=64) {

                count ++;
            }
        }
        System.out.println("Count iS: "+count);
    }  

}
