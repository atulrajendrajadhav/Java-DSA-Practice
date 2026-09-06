// 17. WAP to find the first missing element in an array. 
public class PrintFristMissingEle17 {
    public static void main(String[] args) {
        int num[] = {1, 4, 6};
        int n = 6;

        printSumOfMissingNum(num, n);
    } 
    public static void printSumOfMissingNum(int[] num, int range){
        int max = max(num);
        boolean []isPresent = new boolean[max + 1];

        for(int i=0; i<num.length; i++){
            if (i <= max) {
                isPresent[num[i]] = true;
            }
        }

        // print false means missing element
       System.out.println("Frist missing element in array is: ");
        for(int i=1; i<= max; i++){
            if (!isPresent[i]) {
                System.out.println(i);
               break;
            }
        }
        
    }


    public  static  int max(int num[]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return  max;
    }

}
