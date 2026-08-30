// WAP to create new Array and store all Neon number in an new array from existing array 

//A neon number is a number where the sum of the digits of its square is equal to the number itself
public class StoreNeonNumber81 {
    public static void main(String[] args) {
        int num[] = { 1, 5, 9, 12 };
        int cnt = countNeon(num);
        int result[] = findNeonArray(num, cnt);
        System.out.println("the neon array is : ");
        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
    public static int[] findNeonArray(int[] num, int cnt){
        int result[] = new int[cnt];
        int index = 0;

        for(int i=0; i<num.length; i++){
            if(isNeon(num[i])){
                result[index] = num[i];
                index++;
            }
        }
        return result;
    }
    public static int countNeon(int[] num){
        int cnt =0;
        for(int i=0;i<num.length;i++){
            if(isNeon(num[i]))
                cnt++;
        }
        return cnt;
    }

    // check neon num individiual
    public static boolean isNeon(int num) {
        int square = num * num;
        int temp = square;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return num == sum;
    }

}
