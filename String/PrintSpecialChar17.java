// 17)WAP to count only special character in a given String
public class PrintSpecialChar17 {
    public static void main(String[] args) {
        String s = new String("$2 #YT@;l");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(ch>=33 && ch<=47 || ch>=59 && ch<=64) {

                //System.out.println("CH : "+ch);
                count++;
            }
        }
        System.out.println("Count is: "+count);
    }  

}
