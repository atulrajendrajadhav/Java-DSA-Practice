// 9. Convert upper case to lowercase of each world first character 
public  class PrintFristCharUpperCase9 {

    public static void main(String[] args) {
       
        String s = "Java is high level, platform independant, Object oriyented programming langauge";
        upperToLower(s);
    }

    public  static  void upperToLower(String s) {
        s = " "+s;
        String res = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == ' ') {
               System.out.println(s.toLowerCase(i+1));
            }
            else{
                continue;
            }
        }
    }
}