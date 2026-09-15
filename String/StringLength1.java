// 1)WAP to print length of an string without using length() and length variable 
public class StringLength1{
   public static void main(String[] args) {
      String s = new String("JAVA ");
      System.out.println("Length is: "+printLenght(s));
   }

   public static int printLenght(String s) {
      char []ch  = s.toCharArray();
      int count =0;

      for(int i : ch){
         count ++;
      }
      return count ;

   }
}
