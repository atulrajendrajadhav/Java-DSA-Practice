// 33.WAP to print last vowel from char[]
public class LastVowelInChar69 {
    public static void main(String[] args) {
       char[] ch = {'#', 'T', 'm', 'E', '7', 'a'};  
       lasttVowelInChar(ch);
    }
    public static void lasttVowelInChar(char ch[]){
        System.out.println("Last Vowl in char is: ");
        for(int i=ch.length-1; i>0; i--){
            if((ch[i]=='A' || ch[i] =='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U' )
                || (ch[i]=='a' || ch[i] =='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    }
}
