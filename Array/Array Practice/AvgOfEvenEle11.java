public class AvgOfEvenEle11 {
    public static void main ( String [] args) {
        int [] number = { 12, 15, 18, 21, 24, 27};
        avgOfEvenEle(number);
    }
    public static void avgOfEvenEle (int []number){
        double avg =0;
        int count = 0;
        int sum  = 0;
        for(int i=0; i<number.length; i++){
            if(number[i] % 2 == 0){
                count ++;
                avg=(sum += number[i])/count;
            }
        }
        System.out.println("Avg of Elven elemnt is: "+avg);
    }
}