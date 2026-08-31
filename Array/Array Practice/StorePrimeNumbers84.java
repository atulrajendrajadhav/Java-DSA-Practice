// WAP to create new Array and store all Prime number in an an new array from existing array 
// A prime number is a whole number greater than 1 that can only be divided evenly by 1 and itself
public class StorePrimeNumbers84 {
    public static void main(String[] args) {
        int num[] = {2, 1, 6, 7, 9, 11, 5, 21, 18};
        
        int count = countPrime(num); // store count prime number
        //System.out.println(count);

        int result[] = printPrime(num, count); // call method to print new prime Array
        
        // loop for print new Array
        for(int i=0; i<result.length; i++){
            System.out.println("Prime number new Array is: ");
            System.out.print(result[i]+" ");
        } 
    }



    // method to find prime numbers and stores in array 
    public static int[] printPrime(int num[], int count){
        int []result = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++){
            if (isPrime(num[i])) {
                result[index] = num[i];
                index++;
            }
        }
        return result;
    }



    // count method to count new prime number to declare new array
    public static int countPrime(int num[]) {
        int count = 0;
        for(int i=0; i<num.length;i++){
            if (isPrime(num[i])) {
                count ++;
            }
        }
        return count;
    }



    // Boolean method to find num isPrime 
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        int i = 2;
        while (i<num-1) {
            if(num % i ==0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
