// WAP to print sum of odd ASCII value characters 
public class SumOfOddASCII_Value58 {
    public static void main(String[] args) {
        char[] ch = {'A', 'b', 'C', 'd', 'E'};
        sumOfOddASCII(ch);
    }
    public static void sumOfOddASCII(char ch[]){
        int sum =0;
        for(int i=0; i<ch.length; i++){
            if((int)ch[i] % 2 != 0){ 
                sum+=ch[i];
            }
        }
        System.out.println("Sum of Even ASCII is: "+sum);
    }
}
