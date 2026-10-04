// 19. WAP to print the first duplicate element. 

public class PrintFristDublicateEle19 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 3, 4, 5, 8};
        printFrequency(num);
    }
    public static void printFrequency(int num[]){
        int min = min(num);
        int max = max(num);

        int count[] = new int[max + 1];

        for(int i=0; i<num.length; i++){
            count[num[i]] ++;
        }

        System.out.println("Frist Dublicate element is: ");
        for(int i = min; i<count.length; i++){
            if(count[i] > 1){
                System.out.println(i+" ======> "+count[i]);
                break; // to stop one iteration
            }
        }
    }


    public static int min(int num[]){
        int min = Integer.MAX_VALUE;

        for(int i : num){
            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;
    }
    
    public static int max (int num[]){
        int max = Integer.MIN_VALUE;
        for(int i : num){
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }

}
