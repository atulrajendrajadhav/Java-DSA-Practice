// 22. WAP to print the last unique element.  
public class PrintLastUniqueEle22 {
     public static void main(String[] args) {
        int num[] = {2,6, 8, 4, 5, 4, 5, 7,2};
        printFrequency(num);
    }
    public static void printFrequency(int num[]){
        int max = max(num);

        int count[] = new int[max + 1];

        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        System.out.println("Frist Dublicate element is: ");
        for(int i = count.length-1; i !=0; i--){
            if(count[num[i]] == 1){
                System.out.println(num[i]+" ======> "+count[num[i]]);
                break; // to stop one iteration
            }
        }
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
