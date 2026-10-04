//  2. WAP to print sum of all missing element in a given array
public class PrintSumOfMissingEle2 {
    public static void main(String[] args) {
        int num[] = {1, 4, 5, 6};
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
        int sumOfMissing =0;
        for(int i=1; i<= max; i++){
            if (!isPresent[i]) {
                System.out.println(i);
                sumOfMissing += i;
            }
        }
        System.out.println("Sum of all missing elemt is: "+sumOfMissing);
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
