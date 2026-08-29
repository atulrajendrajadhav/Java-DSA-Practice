// print characters in reverse order from char[] 
public class CharInReverseOrder44 {
    public static void main(String[] args) {
        char arr[] =   {'A', '7', '@', 'b', '#', '9', '$', '3', 'M'}; 
        getReverseChar(arr);
    }
    public static void getReverseChar (char [] arr) {
        System.out.println("Given char Array in Reverse order: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
