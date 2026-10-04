import java.util.Arrays;

public class SegregatePrimeNonPrimeIndex127 {
    public static void main(String[] args) {
        int arr[] = {10, 21, 32, 43, 54, 65, 76, 87, 98, 19};
        System.out.println(Arrays.toString(arr));
 
        segregatePrimeNonPrimeIndex(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregatePrimeNonPrimeIndex(int num[]) {
        int result[] = new int[num.length];
        int pos = 0;
 
        // first collect elements standing at PRIME indices
        for (int i = 0; i < num.length; i++) {
            if (isPrimeIndex(i)) {
                result[pos] = num[i];
                pos++;
            }
        }
        // then collect elements standing at NON-PRIME indices
        for (int i = 0; i < num.length; i++) {
            if (!isPrimeIndex(i)) {
                result[pos] = num[i];
                pos++;
            }
        }
 
        // copy the rearranged data back into the original array
        for (int i = 0; i < num.length; i++) {
            num[i] = result[i];
        }
    }
 
    public static boolean isPrimeIndex(int index) {
        if (index < 2) return false;
        for (int i = 2; i * i <= index; i++) {
            if (index % i == 0) return false;
        }
        return true;
    }
}
