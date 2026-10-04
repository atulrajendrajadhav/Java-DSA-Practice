// 19. WAP to find the first two missing elements. 
public class PrintFristTwoMissingEle19 {
    public static void main(String[] args) {
        int num[] = {1, 3, 4, 6};
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
        int missingCount = 0;
       System.out.println("Frist two missing element in array is: ");
        for(int i=1; i<= max; i++){
            if (!isPresent[i]) {
                System.out.println(i);
              missingCount ++;
            }
            if (missingCount == 2) {
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
