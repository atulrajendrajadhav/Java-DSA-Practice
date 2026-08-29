class SumOfNum1 {
    public static void main (String [] args) 
    {
        int num[]  = {10, 20, 30, 40, 50};
        geSum(num);
    }
    public static void geSum(int num[]) 
    {
        int sum = 0;
        for(int i=0; i<num.length; i++)
        {
            sum += num[i];
        }
        System.out.println("Sum of all Num is: "+sum);
    }
}