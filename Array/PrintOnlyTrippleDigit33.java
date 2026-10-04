public class PrintOnlyTrippleDigit33 {
    public static void main (String []args) {
        int [] number  = {20, 3, 21, 233, 8, 9, 4, 32, 987};
        getTrippleDigit(number);
    }
    public static void getTrippleDigit(int number[]) {
        System.out.println("Tripple Digit in given Array is: ");
        for (int i=0; i<number.length; i++){
            if(number[i] >=100 && number[i]<1000){
                System.out.print(number[i]+" ");
            }
        }
    }
}