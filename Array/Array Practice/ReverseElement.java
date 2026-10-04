public class ReverseElement {
    public static void main(String[] args) {
        int a[] = {132, 246, 783, 654};

        //give reverse method input
        for(int i=0; i<a.length; i++){
            int rev = reverseEle(a[i]);
            a[i] = rev;
        }
        
        // output 
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static int reverseEle(int num){
        int rev = 0;
        while (num > 0) {
            rev = rev * 10+(num%10);
            num /=10;
        }
        return rev;
    }
}