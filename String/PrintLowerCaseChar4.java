// 4)WAP to print only lowercase character in a given String
class PrintLowerCaseChar4 {
    public static void main(String[] args) {
        String s = new String("Hellow jAVa");
        printLowerCase(s);

    }
    public static  void printLowerCase(String s){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                System.out.println("CH: "+c);
            }
        }
    }

}