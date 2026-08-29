// .WAP to print last consonant from char[]
public class LastConsonantInChar70 {
    public static void main(String[] args) {
       char[] ch = {'#', 'T', 'm', 'E', 'A', 'a'};  
       lastConsonantChar(ch);
    }
    public static void lastConsonantChar(char ch[]){
        System.out.println("Last Consonat in char is: ");
        for(int i=ch.length-1; i>0; i--){
            if((ch[i]!='A' && ch[i] !='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U' )
                && (ch[i]!='a' && ch[i] !='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')){
                System.out.print(ch[i]+" ");
                break;
            }
        }
    }
}
