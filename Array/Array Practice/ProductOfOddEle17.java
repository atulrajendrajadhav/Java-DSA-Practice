public class ProductOfOddEle17 {
    public static void main (String [] args) {
        int []number = {10, 3, 30, 5, 50};
        productOfodd(number);
    }
    public static void productOfodd(int number[]) {
        int product = 1;
        
        for(int i=0; i<number.length; i++) {
            if(number[i] %2 != 0) {
                product*=number[i];
            }
            
        }
        System.out.println("Product of all odd num is: "+product);
    }
}