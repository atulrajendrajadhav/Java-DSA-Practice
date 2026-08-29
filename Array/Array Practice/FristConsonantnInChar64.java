// .WAP to print first consonant in char[]
public class FristConsonantnInChar64 {
    public static void main(String[] args) {
       char[] ch =  {'e', '3', 'A', 'k', 'e', 'M'};  
       fristConsonantnInChar(ch);
    }
    public static void fristConsonantnInChar(char ch[]){
        System.out.println("Frist Vowel in char is: ");

        for(int i=0; i<ch.length; i++){
            if((ch[i]!='A' && ch[i] !='E'&& ch[i]!='I'&& ch[i]!='O'&&ch[i]!='U' )
                && (ch[i]!='a' && ch[i] !='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!='u')){
                System.out.print(ch[i]+" ");
    
            }
            
        }
    }
}
