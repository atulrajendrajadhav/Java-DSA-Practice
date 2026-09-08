public class ArrayElementToBinry {
    public static void main(String[] args) {
        int [] arr = {10, 20, 15, 7};

        for(int i=0; i<arr.length; i++) {
            int binary = eleBinary(arr[i]);
            arr[i] = binary;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int eleBinary(int num){
        int bin = 0;
        int lastDigit = 0;

        int i  = 1;
        while (num > 0) {
            lastDigit = num%2;
            bin = lastDigit*i+bin;
            num /= 2;
            i  = i*10;
        }
        return bin;
    } 
}
