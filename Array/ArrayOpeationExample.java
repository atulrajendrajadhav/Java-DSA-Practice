import java.util.Scanner;
public class ArrayOpeationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 Array Creation 
        int [] mark = new int[6];

        //2 Input of Array
        System.out.println("Enter the marks ");
        for(int i=0; i<mark.length; i++){
            mark[i] = sc.nextInt();
        }

        //3 Output of Array
        System.out.println("Output is: ");
        for(int i=0; i<mark.length; i++){
            System.out.print(mark[i]+" ");
        }

        //4 Array updation
        System.out.println("\nEnter the Index to Upadte array");
        int index = sc.nextInt();

        System.out.println("Enter the Index value ");
        int value = sc.nextInt();
        mark[index] = value;

        //After updation outut
        System.out.println("Updated marks is: "); 
        for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
        }
        sc.close();
    }
}
