// WAP to print product of odd ASCII value character
public class ProductOfOddASCII_Value62 {
    public static void main(String[] args) {
        char[] ch = {'M', 'N', 'O'};
        productSCIIOdd(ch);
    }
    public static void productSCIIOdd(char ch[]){
        double pro =1;
        
        for(int i=0; i<ch.length; i++){
            if((int)ch[i]%2!=0){
                pro*=(int)ch[i];
            }
        }
        System.out.println("Product ASCII Value is: "+pro);
        
    }
}
