// 14. WAP to find the smallest missing odd number. 
public class PrintSmallestMissingOddEle14 {
    public static void main(String[] args) {
        int num[] = {1, 2, 4, 6};
        int n = 6;
        printSmallestMissingEven(num, n);
    }

    public static void printSmallestMissingEven(int[] num, int range) {
        int max = max(num);
        boolean[] isPresent = new boolean[max + 1];
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= max) {
                isPresent[num[i]] = true;
            }
        }
        
        // Loop to find the first/smallest missing even number
        System.out.println("Smallest missing Odd element is: ");
        for (int i = 1; i <= max; i++) {
            if (!isPresent[i] && i % 2 != 0) {
                System.out.println(i);
                break; // Stop after finding the first one
            }
        }
    }

    public static int max(int num[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

}
