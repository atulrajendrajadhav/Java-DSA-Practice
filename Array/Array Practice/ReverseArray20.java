public class ReverseArray20 {
    public static void main ( String [] args) {
        int [] number = { 10, 20, 30, 40, 50};
        ReverseArray(number);
    }
    public static void ReverseArray(int []number){
        System.out.println("Reverse Array is: ");
        
         for(int i=number.length-1; i>=0; i--){
            System.out.print(number[i]+" ");
         }
    }
}