public class PrintSubArrays {
    public static void main ( String [] args){
        int [] numbers = {2, 4 , 6, 8, 10};
        printSunArray(numbers);
    }
    public static void printSunArray(int numbers[]) {
        int totalSbArry = 0;
    
        for(int i=0; i<numbers.length; i++){ // loop to find start
            int start = i;

            for(int j=i; j<numbers.length; j++){ // loop to find end
                int end = j;
                for(int k=start; k<=end; k++){ // loop to print sub arrya
                    System.out.print(numbers[k]+" ");//sub arrays 
                    
                }
                System.out.println();//print next blank line
            }
             System.out.println();// print next arrays 
        }
        System.out.println("Total sub Arrsy is: "+totalSbArry);
    }
}