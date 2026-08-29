public class PrintPuzzNumber23 {
    public static void main ( String [] args) {
        int [] number = { 14, 27, 35, 42, 50, 67, 89};
        puzzNumber(number);
    }
    public static void puzzNumber(int []number){
        System.out.println("Puzz number is: ");
        
        for(int i=0; i<number.length; i++){
            if(number[i]%7==0 || number[i]%10==7){
                System.out.print(number[i]+" ");
            }
        }
    }
}