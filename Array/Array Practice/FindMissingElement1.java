// 1. WAP to find the missing number from 0 to n.

public class FindMissingElement1 {
    public static void main(String[] args) {
        int num[] = {1, 4, 5, 6};
        int n = 6;

        int missingEle = printMissingEle(num, n);
        System.out.println("Missing element is: "+missingEle);

    }
    public static  int printMissingEle(int num[], int n){
        int expectedSum  = 0;
        // Calculate expected sum
        expectedSum = n*(n+1)/2;

        // claculate actual sum
        int actualSum = 0;
        for(int i=0; i<num.length; i++){
            actualSum += num[i];
        }

        return  expectedSum - actualSum;
        

    }
}