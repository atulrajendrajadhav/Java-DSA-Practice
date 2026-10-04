public class StorePerfectNumber93 {
    public static void main(String[] args) {
        int num[] = {6, 28, 496, 4, 8, 398, 732};

        int count = countPerfect(num);

        int[]result = printPerfect(num, count);
        System.out.println("perfect number is ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
    public static int[] printPerfect(int num[], int count){
        int result[] = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++) {
            if (isPerfect(num[i])) {
                result[index] = num[i];
                index ++;
            }
        }
        return result;
    }


    public static int countPerfect(int num[]){
        int count =0;

        for(int i=0; i<num.length; i++){
            if (isPerfect(num[i])) {
                count ++;
            }
        }
        return count;
    }

    // Boolean method containing the perfect number logic
    public static boolean isPerfect(int num) {
        // Perfect numbers must be greater than 1
        if (num <= 1) {
            return false;
        }

        int sum = 0;

        // Loop through all possible proper divisors up to num / 2
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to the sum
            }
        }

        // Return true if sum of divisors equals the original number, else false
        return sum == num;
    }
}
