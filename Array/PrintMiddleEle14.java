import java.util.*;
public class PrintMiddleEle14 {

    public static void main(String [] args) {
    int number[] = {10, 20, 30, 40, 50};
    sumOfOddIndex(number);

    }
    public static void sumOfOddIndex(int []number) {
        int index  = 0;
        int mid = 0;
        index = number.length/2;
        mid = number[index];

        System.out.println(Arrays.toString(number));
        System.out.println("Mid of Given Array is: "+mid);
    }
}