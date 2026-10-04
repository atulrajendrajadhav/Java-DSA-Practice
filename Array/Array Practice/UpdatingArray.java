import java.util.Arrays;

public class UpdatingArray {
    public static void main (String [] args){
        //Updating means changing an existing value at a particular index.
        int [] marks = {10, 20, 30, 40, 50};
         // Bafore update 
         System.out.println(Arrays.toString(marks));
        marks[2] = 200;
       //Ufter Updation 
        System.out.println(Arrays.toString(marks));
    }
}
