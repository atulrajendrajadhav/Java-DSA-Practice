// 19)WAP to print except upper case character in given String

public class ExceptUpperCase19 {
    public static void main(String[] args) {
        String s  = new String("HEllow JaVa");
        printUppeCase(s);
    }
    public static void printUppeCase(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!Character.isUpperCase(ch)){
                System.out.println("ch: "+ch);
            }
        }
    }
}
