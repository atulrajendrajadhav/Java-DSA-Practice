// WAP to print last special character from char[]
public class LatSpecialChar73 {
   public static void main(String[] args) {
        char[] ch = {'A', '#', '&', '7', 'P', 'e'};  
       lastSpecialInChar(ch);
    }
    public static void lastSpecialInChar(char ch[]){
        System.out.println("Last Special in char is: ");
        for(int i=ch.length-1; i>0; i--){
            if((ch[i]>=33 && ch[i]<=47) || (ch[i]>=58 && ch[i]<=64)){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    } 
}
