import java.util.Arrays;

public class SegregateEvenOddIndex126 {
    public static void main(String[] args) {
        int arr[] = {10, 21, 32, 43, 54, 65, 76, 87, 98, 19};
        System.out.println(Arrays.toString(arr));
 
        segregateEvenOddIndex(arr);
 
        System.out.println(Arrays.toString(arr));
    }
 
    public static void segregateEvenOddIndex(int num[]) {
        int result[] = new int[num.length];
        int pos = 0;
 
        // first collect elements standing at EVEN indices
        for (int i = 0; i < num.length; i++) {
            if (isEvenIndex(i)) {
                result[pos] = num[i];
                pos++;
            }
        }
        // then collect elements standing at ODD indices
        for (int i = 0; i < num.length; i++) {
            if (!isEvenIndex(i)) {
                result[pos] = num[i];
                pos++;
            }
        }
 
        // copy the rearranged data back into the original array
        for (int i = 0; i < num.length; i++) {
            num[i] = result[i];
        }
    }
 
    public static boolean isEvenIndex(int index) {
        return index % 2 == 0;
    }
}
