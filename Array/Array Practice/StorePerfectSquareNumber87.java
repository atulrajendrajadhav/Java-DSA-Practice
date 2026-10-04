// WAP to create new Array and store all Perfect square number in an an new array from existing array 
// A perfect square is a number you get when you multiply an integer (a whole number) by itself.
public class StorePerfectSquareNumber87 {
    public static void main(String[] args) {

        int num[] = { 2, 5, 9, 8, 25, 64, 25, 49 };

        int count = countPerfectSquare(num);

        int result[] = printPerfectSquare(num, count);
        System.out.println("New Perfect Square Array is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] printPerfectSquare(int num[], int count) {
        int result[] = new int[count];
        int index = 0;

        for (int i = 0; i < num.length; i++) {
            if (isPerfectSquare(num[i])) {
                result[index] = num[i];
                index++;
            }
        }
        return result;
    }

    public static int countPerfectSquare(int num[]) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (isPerfectSquare(num[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPerfectSquare(int num) {
        int i = 0;

        while (i * i <= num) {
            if (i * i == num)
                return true;
            i++;
        }
        return false;
    }
}
