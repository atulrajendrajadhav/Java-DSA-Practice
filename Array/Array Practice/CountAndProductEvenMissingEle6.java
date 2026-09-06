// WAP to print count and product of even missing digit in a given array 

public class CountAndProductEvenMissingEle6 {
    public static void main(String[] args) {
        int num[] = {1, 5, 7, 9};
        int n = 6;

        printSumOfMissingNum(num, n);
    } 
    public static void printSumOfMissingNum(int[] num, int range){
        int max = max(num);
        boolean []isPresent = new boolean[max + 1];

        for(int i=0; i<num.length; i++){
            if (i <= max) {
                isPresent[num[i]] = true;
            }
        }

        // print false means missing element
        int prodOfMissing =1;
        int countMissingele = 0;
        for(int i=1; i<= max; i++){
            if (!isPresent[i] && i %2==0) {
            
                prodOfMissing *= i;
                countMissingele ++;
                System.out.println(i);
            }
        }
        System.out.println("Missing even elemet is: "+countMissingele+" Product of this element is: "+prodOfMissing);
    }


    public  static  int max(int num[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return  max;
    }

}
