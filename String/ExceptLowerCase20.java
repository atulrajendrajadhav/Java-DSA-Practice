// 20)WAP to print Except lowercase character in a given String 
public class ExceptLowerCase20 {
     public static void main(String[] args) {
        String s = new String("Hellow jAVa");
        printLowerCase(s);

    }
    public static  void printLowerCase(String s){
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isLowerCase(c)){
                System.out.println("CH: "+c);
            }
        }
    }

}
