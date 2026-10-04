// 3. Print each world last character 
public class PrintEachWordLastChar3 {
    public static void main(String[] args) {
        String s = "Java Is High Level L";
        printLastChar(s);
    }
     public static  void printLastChar(String s) {
        s = s+" ";

        for(int i=s.length()-1; i>0; i--){
            char ch = s.charAt(i);

            if(ch == ' '){
                System.out.println(s.charAt(i-1));
            }
            else {

                continue;
            }
        } 
     }
}