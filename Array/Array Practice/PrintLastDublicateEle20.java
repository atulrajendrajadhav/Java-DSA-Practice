// 20. WAP to print the last duplicate element.
public class PrintLastDublicateEle20 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5, 4, 5, 3, 4, 5, 8};
        printFrequency(num);
    }
    public static void printFrequency(int num[]){
        int min = min(num);
        int max = max(num);

        int count[] = new int[max + 1];

        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        System.out.println("Last Dublicate element is: ");
        for(int i = count.length-1; i !=0; i--){
            if(count[i] > 1){
                System.out.println(i+" ======> "+count[i]);
                break; // to stop one iteration
            }
        }
    }


    public static int min(int num[]){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
    
    public static int max (int num[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
