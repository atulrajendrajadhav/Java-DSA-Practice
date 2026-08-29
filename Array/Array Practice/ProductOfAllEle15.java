class ProductOfAllEle15 {
    public static void main (String [] args) 
    {
        int num[]  = {10, 20, 30, 40, 50};
        geProduct(num);
    }
    public static void geProduct(int num[]) 
    {
        int sum =1;
        for(int i=0; i<num.length; i++)
        {
            sum *= num[i];
        }
        System.out.println("Sum of all Num is: "+sum);
    }
}