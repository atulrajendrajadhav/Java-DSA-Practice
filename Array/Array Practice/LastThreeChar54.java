// WAP to print last 3 character from char[]
public class LastThreeChar54 {
    public static void main(String[] args) {
       char []ch =  {'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7'}; 
        lastThreeChar(ch);
    }
    public static void lastThreeChar(char ch[]){
        System.out.println("Last three char is: ");
        for(int i=ch.length-3; i<ch.length; i++){
            System.out.print(ch[i]+" ");
        }
    }
}
