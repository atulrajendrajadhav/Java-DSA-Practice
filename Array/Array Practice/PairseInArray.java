public class PairseInArray {
    public static void main (String [] A){
        int numbers[] = {2, 4, 6, 8, 10};
        printPairse(numbers);

    } 
    public static void printPairse(int numbers[] ) {
         int totalPairese = 0;
        // Outer loop to print Current frist value 
        for(int i=0; i<numbers.length; i++){ // 2 4 6 8 10
            int current = numbers[i];

            //Outer loop print paire value with current value 
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" +current+ ","+ j+ ")" +" ");
                totalPairese ++;   
            }
            System.out.println(" ");
        }
        System.out.println("Total pairse is: "+totalPairese);
    }
}
