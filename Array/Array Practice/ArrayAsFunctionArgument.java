import java.util.Scanner;
public class ArrayAsFunctionArgument {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main (String[]ags){
        Scanner sc = new Scanner(System.in);
        // Array 
        int [] marks = new int[5];
        
        //Array input
        System.out.println("Enter the marks ");
        for(int i=0; i<marks.length; i++){
            marks[i] = sc.nextInt();
        }
        update(marks);
        System.out.println("Updated marks is: ");
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();

    }    
}
