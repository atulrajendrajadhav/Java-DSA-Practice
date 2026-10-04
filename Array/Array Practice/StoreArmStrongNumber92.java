// WAP to create new Array and store all Armstrong number 
// in an an new array from existing array 

// An Armstrong number is a number that equals the sum of its own digits, 
// where each digit is raised to the power of the total number of digits in that number
public class StoreArmStrongNumber92 {
    public static void main(String[] args) {
        int num[] = {153, 1632, 10, 32, 37682, 832};

        int count = countArmStrongNUm(num);

        int result[] = printArmStong(num, count);
        System.out.println("ArmStrong number is: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

    }
    public static int[] printArmStong(int num[], int count){
        int result[] = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++){
            if (isArmStrong(num[i])) {
                result[index] = num[i];
                index++;
            }
        }
        return result;
    }


    public static int countArmStrongNUm(int num[]){
        int count  = 0;
        for(int i=0; i<num.length; i++){
            if (isArmStrong(num[i])) {
                count ++;
            }
        }
        return count;
    }

    public static boolean isArmStrong(int num) {
        int originalNumber = num;
        int sum = 0;
        
        // Find the total number of digits
        int digits = String.valueOf(num).length();
        
        // Extract digits, raise to power, and add to sum
        while (num > 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, digits);
            num = num / 10;
        }
        return sum== originalNumber;
    }
}
