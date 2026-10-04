
public class LinearSearch1 {
    public static void main(String[] args) {
        
        int[] numbers = {10, 14, 16, 20, 25, 30, 32};
        int key = 21;

        int index = lnearSearch(numbers, key); 
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Value as index: "+index);
        }
    }
    // Time complexcity O(n), loop run array n th
    public static int lnearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
}