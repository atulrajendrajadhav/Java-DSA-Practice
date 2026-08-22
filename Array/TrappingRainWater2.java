public class TrappingRainWater2 {
    public static void main(String [] args) {
        int height[] = {4, 1, 3, 6, 5, 2, 8};
        System.out.println("Traped Water is: "+trapedRainWater(height));
    }

    public static int  trapedRainWater(int []height) {
        // Loop to calculate left max boundary
        int leftMax[] = new int[height.length]; //leftmax Array == same as height array
        leftMax[0] = height[0]; //for height 0 left max = 0

        for(int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]); // Start from 1
        }

        // Loop to calculate right max boundary 
        int reightMax[] = new int[height.length];
        reightMax[height.length-1] = height[height.length-1];

        for(int i=height.length-2; i>=0; i--){
            reightMax[i] = Math.max(height[i], reightMax[i+1]);
        }

        int trapedWater = 0;

        // loop to print traped water
        for(int i=0; i<height.length; i++){
             // Water level = min(left max bound - right max bound)
            int waterLevel = Math.min(leftMax[i], reightMax[i]);

              // traped water = water level - height
            trapedWater += waterLevel - height[i];
        }
        return  trapedWater;
    }
}
