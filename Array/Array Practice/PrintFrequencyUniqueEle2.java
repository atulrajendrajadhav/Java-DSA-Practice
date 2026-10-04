// 2. WAP to print only the frequency of unique elements.

public class PrintFrequencyUniqueEle2 {
    public static void main(String[] args) {
        int num[] = {2, 4, 7, 5, 5, 2, 6, 8, 9, 3, 7,4};
        printFrequency(num);
    }
    public static void printFrequency(int num[]){
        int min = min(num);
        int max = max(num);

        int count[] = new int[max+1];
        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }
        for(int i=min; i<count.length; i++){
            if (count[i] == 1) {
                System.out.println(i+" ========> "+count[i]);
            }
        }
    }

    public static int min(int num[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
    public static int max(int[]num){
        int max  = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
