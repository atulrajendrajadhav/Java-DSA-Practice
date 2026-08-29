public class PrintOnlySingleDigit31 {
    public static void main (String []args) {
        int [] number  = {20, 3, 21, 233, 8, 9, 4, 32};
        getSingleDigi(number);
    }
    public static void getSingleDigi(int number[]) {
        System.out.println("Single Digit in given Array is: ");
        for (int i=0; i<number.length; i++){
            if(number[i] <= 9){
                System.out.print(number[i]+" ");
            }
        }
    }
}