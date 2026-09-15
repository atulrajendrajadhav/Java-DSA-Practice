// 11)WAP to count only upper case character in  a given String
public class CountUpperCase11 {
     public static void main(String[] args) {
        String s  = new String("HEllow JaVa");
        printUppeCase(s);
    }
    public static void printUppeCase(String s){
        int count =0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch >= 'A' && ch<= 'Z'){
                System.out.println("ch: "+ch);
                count++;
            }
        }
        System.out.println("Count IS: "+count);
    }
}
