public class SumOfEvenIndexEle9 {

    public static void main(String [] args) {
    int number[] = {10, 20, 30, 40, 50};
    sumOfEven(number);

    }
    public static void sumOfEven(int []number) {
        int sum = 0;
        for(int i=0; i<number.length; i++){
            if(i%2 == 0){
                sum += number[i];
            }
        }
        System.out.println("Sum Even index number is: "+sum);
    }
}