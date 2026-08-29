public class AvgOfArray2 {
    public static void main (String[]  ags) {
        int num[] = {10, 20, 30, 40, 50};
        getAvg(num);
    }
    public static void getAvg(int []num) {
        int avg = 0;
        for(int i=0; i<num.length; i++){
            avg = (avg += num[i]/5);
        }
        System.out.println("Avg is: "+avg);
    }
}