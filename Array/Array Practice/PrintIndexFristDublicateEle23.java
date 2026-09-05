// 23. WAP to print the index of the first duplicate element. 
public class PrintIndexFristDublicateEle23 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 3, 4, 5, 8};
        printFrequency(num);
    }
    public static void printFrequency(int num[]){

        int firstDuplicateIndex = -1;
        for(int i=0; i<num.length; i++){
            for(int j= i+1; j<num.length; j++){
                if (num[i] == num[j]) {
                    firstDuplicateIndex = i;
                }
            }

            if(firstDuplicateIndex != -1){
                break;
            }
        }
        if (firstDuplicateIndex != -1) {
            System.out.println("First Duplicate element index is: " + firstDuplicateIndex);
            System.out.println("The element is: " + num[firstDuplicateIndex]);
        } else {
            System.out.println("No duplicate elements found.");
        }
}
}
