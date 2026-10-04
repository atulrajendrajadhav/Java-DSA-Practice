// WAP to print first 3 character from char[]
public class FristThreeChar53 {
    public static void main(String[] args) {
       char []ch =  {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'}; 
        fristThreeChar(ch);
    }
    public static void fristThreeChar(char ch[]){
        for(int i=0; i<=2; i++){
            System.out.println(ch[i]+" ");
        }
    }
}
