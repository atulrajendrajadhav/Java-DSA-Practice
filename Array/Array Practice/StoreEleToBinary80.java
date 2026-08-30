// Store every element binary value

public class StoreEleToBinary80 {
   public static void main(String[] args) {
    int []num = {10, 15, 7, 12};  // old int aary to provide value 
    String []binaryValue = new String[num.length];
    
    for(int i=0; i<num.length; i++){
       String binary = findBinary(num[i]);
       binaryValue[i] = binary;
    }

    for(int i=0; i<num.length; i++){
        System.out.print(binaryValue[i]+" ");
    }

   }
   public static String findBinary(int num){
        String binary = " ";
        while(num>0){
            int reminder = num % 2;
            binary = reminder + binary;
            num = num / 2;
        }
        return binary;
   }
}






