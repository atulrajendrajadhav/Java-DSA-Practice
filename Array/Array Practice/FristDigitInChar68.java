// WAP to print first digit character in char[] 
public class FristDigitInChar68 {
    public static void main(String[] args) {
       char[] ch = {'#', '7', 'm', 'P', '@', '9'};   
       fristDigit(ch);
    }
    public static void fristDigit(char ch[]){
        System.out.println("Frist Lower casev in char is: ");

        for(int i=0; i<ch.length; i++){
            if(ch[i]>=47 && ch[i]<=58){
                System.out.print(ch[i]+" ");
            }
            
        }
    }
}
