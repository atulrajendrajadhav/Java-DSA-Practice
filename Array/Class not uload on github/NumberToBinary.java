public class NumberToBinary {
    public static void main(String[] args) {
        int []num = {10, 15, 7, 8};
        for(int i=0; i<num.length; i++) {
            String res = toBinary(num[i]);
            System.out.println(num[i]+" binary is: "+res+" ");
        }
    }

    public static String toBinary(int num) { 
        if (num == 0) {
            return "0";
        }
        
        String binary = ""; 
        while (num > 0) { 
            int remainder = num % 2;     // Get the remainder (0 or 1)
            binary = remainder + binary; // Append it to the front of the string
            num /= 2;                    // Divide the number by 2
        } 
        return binary; 
    } 
}