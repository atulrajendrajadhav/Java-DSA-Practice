public class PrintNonZeroNum24 {
    public static void main ( String [] args) {
        int [] number = { 0, 10, 3, 4, 0, 8, 5, 20, 0};
        nonZeroNum(number);
    }
    public static void nonZeroNum(int []number){
        System.out.println("Non Zero Num Is: ");
        
        for(int i=0; i<number.length; i++){
            if(number[i] > 0){
                System.out.print(number[i]+" ");
            }
        }
    }
}