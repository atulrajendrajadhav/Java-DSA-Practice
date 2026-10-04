// WAP to print last uppercase from char[] 

public class LastUpperCaseInChar71 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', 'M', '7', 'P', 'e'};  
       lastConsonantChar(ch);
    }
    public static void lastConsonantChar(char ch[]){
        System.out.println("Last Upper Case in char is: ");
        for(int i=ch.length-1; i>0; i--){
            if(ch[i]>='A' && ch[i]<='Z'){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    }
}
