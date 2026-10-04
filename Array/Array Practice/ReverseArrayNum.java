public  class ReverseArrayNum {
    public static void main(String[] args) {
        int num[] = {123, 456, 789};

        for(int i=0; i<num.length; i++){
            int rev  = reverseIs(num[i]);
            System.out.print(rev+" ");
        }
    

    }
    public static int reverseIs(int num) {
        int rev = 0;
        while(num>0) {
            int digit =num %10;
            num = num/10;

            rev = rev*10+digit;
        }
        return  rev;
    }
}