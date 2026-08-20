import java.util.Arrays;
public class CraetionArray {
    public static void main ( String [] args){
        //Syntax
        // DataType ArrayName[] = new DataType[];

        // Creating an array means declaring and allocating memory for it
        int mark[] = new int[10];
        System.out.println(Arrays.toString(mark));

        // Array initialize direct
        int mark1[] = {12,34,54,4};
        System.out.println(Arrays.toString(mark1));
        //String Array
        String name[] = {"Atul","om","gaurav","darshan"};
        System.out.println(Arrays.toString(name));
    }
}