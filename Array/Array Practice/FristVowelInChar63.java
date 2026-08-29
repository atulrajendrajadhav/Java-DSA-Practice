// AP to print first vowel in char[] 

public class FristVowelInChar63 {
    public static void main(String[] args) {
       char[] ch = {'#', 'T', 'm', 'E', '7', 'a'};  
       fristVowelInChar(ch);
    }
    public static void fristVowelInChar(char ch[]){
        System.out.println("Frist Vowl in char is: ");
        for(int i=0; i<ch.length; i++){
            if((ch[i]=='A' || ch[i] =='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U' )
                || (ch[i]=='a' || ch[i] =='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    }
}
