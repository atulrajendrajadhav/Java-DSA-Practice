//  WAP to create new Array and store all Spy number in an an new array from existing array
// A spy number is a number where the sum of its individual digits equals the product of those same digits

import java.util.Arrays;

class StoreSpyNumber83{
    public static void main(String[] args){
        int [] num = {13, 12,123,17,22,1412 };
        int cnt = countSpy(num);
        int [] spy = findSpy(num,cnt); 
        System.out.print("The Spy numbers is : ");
        //it is pre define methed to print the arrays which is present in java.util.Arrays package
        System.out.print(Arrays.toString(spy));
        // for(int i=0;i<spy.length;i++)
        //     System.out.print(spy[i]+" ");  
    }
    public static int[] findSpy(int [] num, int cnt ){
        int[] result = new int[cnt];
        int index = 0;
        for(int u=0;u<num.length;u++){
            if(isSpy(num[u])){
                result[index] = num[u];
                index++;
            }
        }
        return result;
    }
    public static int countSpy(int [] num){
        int cnt =0;
        for(int i=0;i<num.length;i++){
            if(isSpy(num[i]))
                cnt++;
        }
        return cnt ;
    } 
    public static boolean isSpy(int a){
        int sum =0;
        int pro =1;
        for(int i=0;a>0;i++){
            int temp = a%10;
            sum+=temp;
            pro*=temp;
            a/=10;
        }
        return sum == pro;
    }
}