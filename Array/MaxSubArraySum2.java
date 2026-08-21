// Used the Prifix Array
public class MaxSubArraySum2 {
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 10 };
        getMaxSubArraySum(numbers);
    }

    public static void getMaxSubArraySum(int[] numbers) {
        int currValue =0;
        int maxValue = Integer.MIN_VALUE; // -infine to campare all sub array values
        int prifix[] = new int[numbers.length];
        
        prifix[0] = numbers[0];

        // calculate prifix array
        for(int i=1; i<prifix.length; i++){
            prifix[i] = prifix[i-1]  + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                currValue = start==0 ? prifix[end] :  prifix[end] - prifix[start-1];
                if(maxValue < currValue){
                    maxValue = currValue;
                }
            }
        }
        System.out.println("Max sub Array sum is: "+maxValue );
    }

}
