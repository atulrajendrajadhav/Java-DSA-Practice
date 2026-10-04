//WAP to print last digit from char[] 
 
public class LastDigitInChar71 {
    public static void main(String[] args) {
        char[] ch = {'A', '4', '#', '8', 'm', '2'};  
       lastConsonantChar(ch);
    }
    public static void lastConsonantChar(char ch[]){
        System.out.println("Last frist Dgit in char is: ");
        for(int i=ch.length-1; i>0; i--){
            if(ch[i]>48 && ch[i]<57){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    }
}