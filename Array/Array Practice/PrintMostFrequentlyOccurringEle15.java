// 15. WAP to print the most frequently occurring element.

public class PrintMostFrequentlyOccurringEle15 {
    public static void main(String[] args) {
        int num[] = { 3, 4, 5, 2, 4, 3, 7, 5, 3, 5, 3, };
        printFrequency(num);
    }

    public static void printFrequency(int num[]){
        int max = max(num);

        int count [] = new int [max+1];
        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        // Find the element with the highest frequency
        int maxCount =0;
        int mostFrquent = num[0];

        for(int i=0; i<count.length; i++){
            if(count[i]> maxCount){
                maxCount = count[i];
                //mostFrquent = i;
            }
        }
        System.out.println("Most frequent element: " + mostFrquent + " (Occurs " + maxCount + " times)");

        

    }

    public static int max(int[] num) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
