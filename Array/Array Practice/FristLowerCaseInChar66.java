// WAP to print first lowercase in char[]

public class FristLowerCaseInChar66 {
    public static void main(String[] args) {
       char[] ch = {'#', '7', 'm', 'P', 'a', 'G'};   
       fristLowerCase(ch);
    }
    public static void fristLowerCase(char ch[]){
        System.out.println("Frist Lower casev in char is: ");

        for(int i=0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z'){
                System.out.print(ch[i]+" ");
            }
            
        }
    }
}
