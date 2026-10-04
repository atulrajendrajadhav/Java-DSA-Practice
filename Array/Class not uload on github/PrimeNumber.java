public class PrimeNumber {
    public static void main(String[] args) {
        int num[] = {12, 7, 3, 6, 9, 38, 23, 15, 13};
        for(int i=0; i<num.length; i++) {
            if(isPrime(num[i])){
                System.out.println(num[i]+" ");
            }
        }
    }
    
    public  static boolean isPrime(int num) {
        if(num<=1) return  false;

        for(int i=2; i*i<num; i++){
            if(num % i==0) return false;

        }
        return true;
    }
}