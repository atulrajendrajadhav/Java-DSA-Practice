// 26. WAP to print the index of the last unique element. 

public class PrintLastUniqueEleIndex26 {
     public static void main(String[] args) {
        int num[] = { 2, 4, 5, 6, 3, 6, 3 };
        printFrequency(num);
    }

    public static void printFrequency(int num[]) {
        int fristDublicateInde = -1;

        for (int i = num.length-1; i > 0; i--) {

            boolean isUniqe = true;

            for (int j =num.length-1; j>0; j--) {
                if (i != j && num[i] == num[j]) {
                    isUniqe  = false;
                    break;
                }
            }
            // If it remains unique, we found our first unique element
            if (isUniqe) {
                fristDublicateInde = i;
                break; // Exit the loop immediately
            }
            }
            if (fristDublicateInde != -1) {
                System.out.println("First Unique element index is: " + fristDublicateInde);
                System.out.println("The element is: " + num[fristDublicateInde]);
            } else {
                System.out.println("No Unique elements found.");
            }
        }
}
