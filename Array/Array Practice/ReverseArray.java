public class ReverseArray {
    public static void main (String[]args) {
        // Array declartion 
        int numbers[] = { 1, 2, 3, 4, 5 };

        //loop to print given array
        System.out.println("Given Array is");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        // call method 
        getReverse(numbers);

        //loop to print reverse arrya
        System.out.println("\nReverse Array is: ");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }

    }
    public static void getReverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;
        
        while (start < end) {
         //Swap array using third variable 
        int temp = numbers[end];
        numbers[end] = numbers[start];
        numbers[start] = temp;

        start ++;
        end --;
        }
    }
}
