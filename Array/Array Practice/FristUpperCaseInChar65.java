// WAP to print first uppercase in char[] 

public class FristUpperCaseInChar65 {
    public static void main(String[] args) {
       char[] ch = {'#', '7', 'm', 'P', 'a', 'G'};   
       fristUpperCase(ch);
    }
    public static void fristUpperCase(char ch[]){
        System.out.println("Frist Vowel in char is: ");

        for(int i=0; i<ch.length; i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                System.out.print(ch[i]+" ");
            }
            
        }
    }
}
