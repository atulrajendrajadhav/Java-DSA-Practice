// WAP to create new Array and store all Evil number in an an new array from existing array 
// An Evil number is a positive whole number whose binary representation contains an even number of 1s. If the count of 1s is odd, it is called an Odious numbe
// 3 in binary is 11 (two 1s, so it is evil).

public class StoreEvilNumber90 {
    public static void main(String[] args) {
        int num[] = {3, 5, 12, 15, 20, 16, 7, 8, 14};

        int count = countEvil(num);

        int []result = printEvil(num, count);
        System.out.println("Evil num Array is: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
        
    }

    public static int[] printEvil (int num[], int count){
        int result[] = new int [count];
        int index = 0;

        for(int i=0; i<num.length; i++) {
            if (isEvilNum( num[i])) {
                result[index] =num[i];
                index ++;
            }
        }
        return result;
    }

    public static int countEvil(int num[]) {
        int count = 0;
        for(int i=0; i<num.length; i++) {
            if (isEvilNum(num[i])) {
                count ++;
            }
        }
        return count;
    }

    public static boolean isEvilNum(int num) {
        int temp = num;
        int countOne = 0;

        while (temp >0){
            if (temp % 2== 1) {
                countOne ++;
            }
            temp = temp /2;
        }
        if(countOne % 2== 0) return true;
        return false;
    }
}
