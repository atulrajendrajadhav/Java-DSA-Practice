
import java.util.Scanner;

public class InputInArray {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);

        // Array declaration/ memory allocation 
        int []mark = new int[5];

        //for loop to get input of array
        System.out.println("Enter the 5 sub marks ");
        for (int i = 0; i<mark.length; i++){
            mark[i] = sc.nextInt();
        }

        //for loop to array output
        for(int i=0; i<mark.length; i++){
            //System.out.println(mark[i]);
            System.out.print(mark[i]+" ");
        }
        sc.close();

    }
}
