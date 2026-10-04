// 9. WAP to replace duplicate elements with -1. 
import java.util.Arrays;

public class ReplaceDublicateWithMinus1_9 {
    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 2, 2, 5, 2, 5, 5};
        System.out.println(Arrays.toString(a));
        replaceDublicate(a);
        System.out.println(Arrays.toString(a));
        
    }
    public static void replaceDublicate(int []num){
        // traval each element to check alredy -1

        for(int i=0; i<num.length; i++){
            if (num[i] == -1) {
                continue;
            }

            for(int j=i+1; j<num.length; j++){
                if(num[i] == num[j])
                num[j] = -1;
            }
        }

    }
}
