public class BinarySearchEx1 {
    public static void main(String[] args) {
        int []numbers = {2, 4, 7, 9, 11, 17, 20};
        int target = 11;

        int result = getSearch(numbers, target);
        if(result != -1){
            System.out.println("Element found at index: "+result);
        }
        else
            System.out.println("Element is not found ");
    }
    
    public static int getSearch (int []numbers, int target) {
        int low = 0;
        int high = numbers.length -1;

        while (low <= high) {
            int mid = (low + high)/2;

            if(numbers[mid] == target){
                return mid;
            }
            else if (target > numbers[mid]){
                low = mid + 1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
}