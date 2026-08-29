// WAP to print sum of even ASCII value characters
public class SumOfEvenASCII_Value57 {
    public static void main(String[] args) {
        char[] ch = {'B', 'c', 'D', 'e'};
        sumOfEvenASCII(ch);
    }
    public static void sumOfEvenASCII(char ch[]){
        int sum =0;
        for(int i=0; i<ch.length; i++){
            if((int)ch[i]%2==0){
                sum+=ch[i];
            }
        }
        System.out.println("Sum of Even ASCII is: "+sum);
    }

}
