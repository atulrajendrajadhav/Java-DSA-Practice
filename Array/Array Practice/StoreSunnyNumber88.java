// WAP to create new Array and store all Sunny number in an an new array from existing array 
// Sunny number is a number N where the next number (\(N + 1\)) is a perfect square.

public class StoreSunnyNumber88 {
    public static void main(String[] args) {
        int num[] = {3, 6, 8, 48, 63, 70, 34};

        int count = countSunnyNum(num);

        int result[] = printSunny(num, count);
        System.out.println("Sunny number Array is: ");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }

        
    }
    public static int[] printSunny(int num[], int count){
        int[]result = new int[count];
        int index = 0;

        for(int i=0; i<num.length; i++){
            if(isSunnyNum(num[i])) {
                result[index] = num[i];
                index ++;
            }
        }
        return result;
    }


    public static int countSunnyNum(int num[]){
        int count = 0;
        for(int i=0; i<num.length; i++){
            if (isSunnyNum(num[i])) {
                count ++;
            }
        }
        return count;
    }

    public static boolean isSunnyNum(int num){
        int next = num+1;
        int i = 0;
        while (i*i<=next) {
            if(i*i == next) return true;
            i++;
        }
        return false;
    }
}
