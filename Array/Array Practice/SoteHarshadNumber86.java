//  WAP to create new Array and store all Harshad number in an an new array from existing array
// A Harshad number (also called a Niven number) is a whole number that can be evenly divided by the sum of its own digits.
// Sum of digits: \(1 + 8 = 9\)Division: \(18 \div 9 = 2\) (No remainder)
public class SoteHarshadNumber86 {
    public static void main(String[] args) {
       int num[] = { 18, 55, 35, 34, 23, 45, 36 };

       int count = countHarshad(num);

       int result[] = printHarshad(num, count);
       System.out.println("New Harshad number array is : ");
       for(int i=0; i<result.length; i++){
        System.out.print(result[i]+" ");
       }

    }

    public static int[] printHarshad(int num[], int count){
        int result [] = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++) {
            if (isHarshad(num[i])) {
                result[index] = num[i];
                index ++;
            }
        }
        return result;
    }

    public static int countHarshad(int num[]){
        int count = 0;
        for(int i=0; i<num.length; i++){
            if (isHarshad(num[i])) {
                count ++;                
            }
        }
        return count;
    }


    public static boolean isHarshad(int num) {
        int sum = 0;
        int temp = 0;
        int originalNum = num;
        while(num != 0) {
            temp = num % 10;
            sum+= temp;
            num = num /10;  
        }
        
        if (originalNum % sum == 0) {
            return true;
        }
        return false; 
    }
}
