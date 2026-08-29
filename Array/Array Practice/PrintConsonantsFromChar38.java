// WAP to print only consonants from char[] 
public class PrintConsonantsFromChar38 {
    public static void main(String[] args) {
        char[] arr = {'A', 'b', 'e', '#', 'I', 'm', 'o', 'P', 'u', '7'};
        
        printConsonants(arr);
        
    }
    public static void printConsonants(char[] arr){
        System.out.println("Consonant is: ");
        
        for(int i=0; i<arr.length; i++){
            if ((arr[i]!='a'&&  arr[i]!='e'&& arr[i]!='i' && arr[i]!='o' && arr[i]!='u')
                && 
                (arr[i]!='A' && arr[i]!='E'&& arr[i]!='I' && arr[i]!='O' && arr[i]!='U')) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
