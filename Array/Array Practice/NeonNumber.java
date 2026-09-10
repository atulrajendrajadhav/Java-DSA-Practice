public class NeonNumber {

    static boolean isNeon(int n) {
        return digitSum(n * n, 0) == n;
    }

    static int digitSum(int n, int sum) {

        if (n == 0)
            return sum;

        return digitSum(n / 10, sum + n % 10);
    }

    public static void main(String[] args) {

        int n = 9;

        if (isNeon(n))
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}