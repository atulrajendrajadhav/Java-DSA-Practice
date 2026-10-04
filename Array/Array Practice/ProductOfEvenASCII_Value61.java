// .WAP to print product of even Ascii value character 

public class ProductOfEvenASCII_Value61 {
    public static void main(String[] args) {
        char[] ch = {'M', 'N', 'O'};
        productSCII(ch);
    }
    public static void productSCII(char ch[]){
        double pro =1;
        
        for(int i=0; i<ch.length; i++){
            if((int)ch[i]%2==0){
                pro*=(int)ch[i];
            }
        }
        System.out.println("Product ASCII Value is: "+pro);
        
    }
}
