// 7. Print each world whose length is 3  
public  class Print3DigitChar7 {
    public static void main(String[] args) {
        String s = "Java is high level, platform independant, Object oriyented programming langauge hii";
        print3DigitChar(s);
    }

    public  static void print3DigitChar(String s) {
        s = s+" ";
        String result = "";

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(ch != ' ') {
                result = result+ch;
            }
            else{
                if(result.length() == 3) {
                    System.out.println(result);
                   
                }
                 result = "";
            }
        }
    }
}