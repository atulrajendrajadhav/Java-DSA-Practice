// 10)WAP to count only spaces in a given String
public class CountSpaceInString10 {
     public static void main(String[] args) {
        String s = new String("$2 #YT@;l  oiuw  ow j");
        printConsonat(s);
    }
    public static  void printConsonat(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);
            
            if(ch==' ') {

                count ++;
            }
        }
        System.out.println("Space Count is: "+count);
    } 
}
