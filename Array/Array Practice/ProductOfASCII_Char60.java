// WAP to print product of Ascii value character

public class ProductOfASCII_Char60 {
    public static void main(String[] args) {
        char[] ch = {'M', 'N', 'O'};
        productSCII(ch);
    }
    public static void productSCII(char ch[]){
        double pro =1;
        
        for(int i=0; i<ch.length; i++){
            
              pro*=ch[i];

        }
        System.out.println("Product ASCII Value is: "+pro);
        
    }
}
