// Linear search of string data 
public class LinearSearchStr {
    public static void main(String[] args) {
        String [] name = {"atul", "om", "vaibhav", "vedant", "darshan", "gaurav"};
        String target = "vaibhav";

        int result = lnearSearch(name, target);
        if(result == -1){
            System.out.println("Name not found");
        }
        else
            System.out.println("Name found at index: "+result);

    }
    public static int lnearSearch(String []name, String target){
        for(int i=0; i<name.length; i++){
            if(name[i] == target)
                return i;
        }
        return -1;
    }
}
