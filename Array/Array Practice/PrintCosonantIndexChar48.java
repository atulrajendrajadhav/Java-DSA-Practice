// WAP to print consonants character index from char[] 

public class PrintCosonantIndexChar48 {
    public static void main(String[] args) {
        char[] ch = { 'A', 'b', '@', 'E', 'm', '#', 'u', 'P', '7' };
        printCosonantIndex(ch);
    }

    public static void printCosonantIndex(char[] arr) {
        System.out.println("Consonant index is: ");
        for(int i=0; i<arr.length; i++){
            if((arr[i]>='A' && arr[i]<='Z') || (arr[i]>='a' && arr[i]<='z'))
{
                if ((arr[i]!='a'&&  arr[i]!='e'&& arr[i]!='i' && arr[i]!='o' && arr[i]!='u')
                && 
                (arr[i]!='A' && arr[i]!='E'&& arr[i]!='I' && arr[i]!='O' && arr[i]!='U')) 
                {
                System.out.print(arr[i]+"="+i+" ");
            }
            }
            
        }
    }
}