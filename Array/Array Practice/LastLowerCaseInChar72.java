// WAP to print last lowercase from char[]
public class LastLowerCaseInChar72 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', 'M', '7', 'P', 'e'};  
       lastLowerCase(ch);
    }
    public static void lastLowerCase(char ch[]){
        System.out.println("Last Lower Case in char is: ");
        for(int i=ch.length-1; i>0; i--){
            if(ch[i]>='a' && ch[i]<='z'){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    }
}
