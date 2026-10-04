// WAP to print Average of ASCII value 
public class AvgOfASCII_Value59 {
    public static void main(String[] args) {
        char[] ch = {'M', 'N', 'O'};
        sumOfAvgSCII(ch);
    }
    public static void sumOfAvgSCII(char ch[]){
        double sum =0;
        int count = 0;
        for(int i=0; i<ch.length; i++){
            
              count++;
              sum += (int)ch[i];

        }
        double avg = sum/count;
        System.out.println("AVG of ASCII Value is: "+avg);
        
    }
}
