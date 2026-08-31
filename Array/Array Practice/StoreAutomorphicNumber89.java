///  WAP to create new Array and store all Automorphic number in an an new array from existing array 
// An automorphic number is a mathematical integer whose square ends with the same digits as the number itself
// 5: \(5^2 = 2\mathbf{5}\) (Ends with 5) → Automorphic

public class StoreAutomorphicNumber89 {
    public static void main(String [] args) {
        int num[] = {25, 5, 26, 36, 49, 64, 81};

        int count = countAutomorphicNum(num);

        int result[] = printAutomorphicNum(num, count);
        System.out.println("New Automorphic number Array is: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        
      
    } 

    public static int[] printAutomorphicNum(int []num, int count){
        int result[] = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++){
            if (isAutomorphicNum(num[i])) {
                result[index] = num[i];
                index ++;

            }
        }
        return result;
    }

    public static int countAutomorphicNum(int []num){
        int count = 0;
        for(int i=0; i<num.length; i++){
            if (isAutomorphicNum(num[i])) {
                count++;
            }
        }
        return count;
    } 


    public static boolean isAutomorphicNum(int num){
        int sqare = num*num;
        int temp = num;

        while(temp != 0) {
            if(temp%10 == sqare%10) return true;

            temp /= 10;
            sqare /=10;
        }
         return false;
    }
}
