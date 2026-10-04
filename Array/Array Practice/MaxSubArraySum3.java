// kadanes Algorithms 
// best way to find sub array sum 
// time complexity = O(n) 
public class MaxSubArraySum3 {
    public static void main (String [] args){
        int [] numbers = {-2, 4, -6, -8, 10}; // given array with + & - values 
        kadanes(numbers);
    }
    public static void kadanes (int [] numbers){
        int currentValue = 0; // current 0 +add next values like 0+1 1+2 3+4 7+8 
        int maxValue = Integer.MIN_VALUE;// min value to campare max values 

        //for loop campare 
        for(int i=0; i<numbers.length; i++){
            currentValue = currentValue + numbers[i];

            if(currentValue < 0){
                currentValue = 0;
            }
            maxValue = Math.max(maxValue, currentValue);
        }
        System.out.println("Max array sum is: "+maxValue);
    }
}
