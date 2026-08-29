public class CheckMiddleEleOrNot13 {
    public static void main (String [] args) {
        int number[]  = {10, 20, 30,};
        

        if(checkMiddle(number) == 1){
            System.out.println("Middle is Available");
        }
        else {
            System.out.println("Middle is Not Available");
        }
    }
    public static int checkMiddle(int number[]){
        for(int i=0; i<number.length; i++){
            if(number.length % 2 !=0) {
               return 1;
            }
        }
        return -1;
    }
}