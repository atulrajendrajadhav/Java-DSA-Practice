// 4. WAP to print count and sum of even missing digit in a given array 

public class CountAndSumEvenMissingEle4 {
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
        int sumOfMissing =1;
        int countMissingele = 0;
        for(int i=1; i<= max; i++){
            if (!isPresent[i] && i %2==0) {
            
                sumOfMissing += i;
                countMissingele ++;
                System.out.println(i);
            }
        }
        System.out.println("Missing even elemet is: "+countMissingele+" Sum of this element is: "+sumOfMissing);
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
