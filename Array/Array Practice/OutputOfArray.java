import java.util.Scanner;
public class OutputOfArray {
    public static void main ( String[]args){
        Scanner sc = new Scanner(System.in);
        
        String [] name = new String[5];
        //Array input
        System.out.println("Enter the names: ");
        for(int i=0; i<name.length; i++){
            name[i] = sc.next();
        }
        // Array output
        System.out.print("Name is: ");
        for(int i=0; i<name.length; i++){
            System.out.print(name[i]+" ");
        }
        sc.close();
    }
}
