public class CoutOddDigit35 {
    public static void main (String []args) {
        int [] number  = {2, 3, 7, 10, 17, 20, 5};
        countOddDigi(number);
    }
    public static void countOddDigi(int number[]) {
        int count = 0;
        for (int i=0; i<number.length; i++){
            if(number[i]%2 != 0){
                count++;
            }
        }
        System.out.println("Count Odd Digit is: "+count);
    }
}