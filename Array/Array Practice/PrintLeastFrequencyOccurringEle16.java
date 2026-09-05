public class PrintLeastFrequencyOccurringEle16 {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 2, 3, 4, 3, 4, 5, 1};
        printFrequency(num);

    }
    public static void printFrequency(int num[]){
        int max = max(num);

        int count[] = new int[max+1];
        for(int i =0; i<num.length; i++){
            count[num[i]]++;
        }

        int minCount = Integer.MAX_VALUE;
        int mostFrquent = -1;
        
        for(int i=0; i<count.length; i++){
            if(count[i]>0 && count[i] < minCount){
                minCount = count[i];
                mostFrquent = i;
            }

        }
        System.out.println("Most frequent element: " + mostFrquent + " (Occurs " + minCount + " times)");
    }

    public static int max(int num[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max = num[i];           
             }
        }
        return max;
    }
}
