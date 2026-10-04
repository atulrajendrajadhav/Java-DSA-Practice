//  WAP to find missing elements between the minimum and maximum element. 

public class MissingEleBetweenMinAndMax8 {
    public static void main(String[] args) {
        int num[] = { 3, 4, 6,  9};
        int range = 9;
        countEle(num, range);
    }
    public  static void countEle(int num[], int renge){
        int min = min(num);
        int max = max(num);

        boolean isPresent[] = new boolean[max +1];
        // store avilable element
        for(int i=0; i<num.length; i++ ){
            if (num[i] <= max) {
                isPresent[num[i]]  = true;
            }
        }

        // print miising element
        for(int i=min; i<= max; i++){
            if (!isPresent[i]) {
                System.out.println(i);
            }
        }
    }

    public static  int min(int num[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if (num[i] < min) {
                min = num[i];
            }
        }
        return  min;
    }

    public static int max (int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if (num[i]> max) {
                max = num[i];                
            }
        }
        return  max;
    }
}
