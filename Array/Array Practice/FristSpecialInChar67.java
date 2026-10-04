// WAP to print first special character in char[]
public class FristSpecialInChar67 {
    public static void main(String[] args) {
       char[] ch = {'#', '7', 'm', 'P', '@', 'G'};   
       fristLowerCase(ch);
    }
    public static void fristLowerCase(char ch[]){
        System.out.println("Frist Lower casev in char is: ");

        for(int i=0; i<ch.length; i++){
            if((ch[i]>=33 && ch[i]<=47)||(ch[i]>=58 && ch[i]<=64)){
                System.out.print(ch[i]+" ");
            }
            
        }
    }
}
