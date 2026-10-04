// 24. WAP to print the index of the last duplicate element.
public class PrintIndexLastDublicateEle24 {
    public static void main(String[] args) {
        int num[] = {3, 5, 5, 2, 3, 5,6};
        printFrequency(num);
    }

    public static void printFrequency(int num[]){
       int firstDuplicateIndex = -1;
        for(int i=num.length-1; i !=0; i--){
            for(int j= i-1; j != 0; j--){
                if (num[i] == num[j]) {
                    firstDuplicateIndex = i;
                }
            }

            if(firstDuplicateIndex != -1){
                break;
            }
        }
        if (firstDuplicateIndex != -1) {
            System.out.println("Last Duplicate element index is: " + firstDuplicateIndex);
            System.out.println("The element is: " + num[firstDuplicateIndex]);
        } else {
            System.out.println("No duplicate elements found.");
        }
}
}