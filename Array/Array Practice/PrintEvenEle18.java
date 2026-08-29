public class PrintEvenEle18 {
    public static void main ( String [] args) {
        int [] number = { 2, 1, 4, 3, 6, 7};
        evenEle(number);
    }
    public static void evenEle (int []number){
         System.out.println("Even num is: ");
        for(int i=0; i<number.length; i++){
            if(number[i]%2 == 0){
                System.out.print(number[i]+" ");
            }
        }
        
    }
}