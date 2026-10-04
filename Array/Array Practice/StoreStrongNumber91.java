// WAP to create new Array and store all Strong number in an an new array from existing array
// A strong number is a positive integer where the sum of the factorials of its individual digits 
// equals the number itself. It is also known as a Krishnamurthy number or a factorio
// 145: \(1! + 4! + 5! = 1 + 24 + 120 = 145\)
public class StoreStrongNumber91 {
    public static void main(String[] args) {
        
         int num[] = {145, 22, 123, 77, 98};

         int count = countStrongNum(num);

         int result[] = printStrong(num, count);
         System.out.println("Strong number Array is: ");
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+" ");
        }



    }
    public static int[] printStrong(int num[], int count){
        int result[] = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++){
            if (isStrongNum(num[i])) {
                result[index] = num[i];
                index ++;
            }
        }
        return result;
    }


    public static int countStrongNum(int num[]) {
        int count =0;
        for(int i=0; i<num.length; i++) {
            if (isStrongNum(num[i])) {
                count ++;
            }
        }
        return count;
    }


    public static boolean isStrongNum(int num) {
       if (num <= 0) return false;

       int originalNum = num;
       int sum = 0;

       //     // Extract each digit and add its factorial to the sum
       while(num > 0) {
        int digit = num % 10;
        sum += factorial(digit);
        num /=10;
       }
       return sum == originalNum;
    }

    private static int factorial(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result *=i;
        }
        return result;
    }
}
