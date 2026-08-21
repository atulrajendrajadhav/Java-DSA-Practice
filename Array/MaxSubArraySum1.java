// brute force method 
public class MaxSubArraySum1 {
    public static void main (String []args){
        int numbers[] = {2, -4, 6, -5, -1, 3};
        getMaxSubArraySum(numbers);

    }
    public static void getMaxSubArraySum(int numbers[]) {
        int totalsb =0;
        int currValue =0;
        int maxValue = Integer.MIN_VALUE; // -infine (Campare max value to lowest value )

        for(int i=0; i<numbers.length; i++){// Outer loop for get start value
            int start = i;

            for(int j=i; j<numbers.length; j++){ // outer inner loop get array end values 
                int end = j;
                currValue =0;

                for(int k=start; k<=end; k++){ // inner loop to print sun arrys 
                    System.out.print(numbers[k]+" ");
                    currValue += numbers[k]; // Calaculate sun array sum

                }

                if(maxValue < currValue){ // campare sum with each sub array sum
                        maxValue = currValue;
                    }

                totalsb++; // calculate total sub array
                System.out.println(" = "+currValue);
            }
            System.out.println();
        }
        System.out.println("Total sub arrys is: "+totalsb);
        System.out.println("Maximum Sub Array Sum is: "+maxValue);
    }
}
