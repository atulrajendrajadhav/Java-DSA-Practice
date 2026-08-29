public class PrintNegativeEle22 {
    public static void main ( String [] args) {
        int [] number = { -10, 20, -30, 40, 50};
        ReverseArray(number);
    }
    public static void ReverseArray(int []number){
        System.out.println("Negative Element is: ");
        
            for(int i=0; i<number.length; i++){
            if(number[i]<0){
                System.out.print(number[i]+" ");
            }
         }
    }
}