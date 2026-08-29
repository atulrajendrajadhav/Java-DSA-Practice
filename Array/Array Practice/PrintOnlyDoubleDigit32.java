public class PrintOnlyDoubleDigit32 {
    public static void main (String []args) {
        int [] number  = {20, 3, 21, 233, 8, 9, 4, 32, 987};
        getDoubleDigi(number);
    }
    public static void getDoubleDigi(int number[]) {
        System.out.println("Double Digit in given Array is: ");
        for (int i=0; i<number.length; i++){
            if(number[i] <=99 && number[i]>9){
                System.out.print(number[i]+" ");
            }
        }
    }
}