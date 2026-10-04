public class BinarySearchEx3 {
    public static void main (String [] args){
        int [] marks = {20, 55, 66, 78, 79, 88};
        int target = 88;

        int result = getBinarySearch(marks, target);
        if(target != result){
            System.out.println("Elment found at index: "+result);
        }
        else
            System.out.println("Element is not found ");

    }
    public static int getBinarySearch(int marks[], int target ){
        int low = 0,  high = marks.length - 1;

        while(low<=high){
            int mid = (low+high)/2;
            // camparision to mid 
            if (marks[mid] == target ) {
                return mid;
            }
            else if(marks[mid] < target) {
                low  = mid +1;
            }
            else{
                high = mid - 1;
            }

        }
        return -1;
    }
}