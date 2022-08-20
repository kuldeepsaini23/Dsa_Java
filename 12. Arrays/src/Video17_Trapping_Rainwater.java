import java.util.Scanner;

public class Video17_Trapping_Rainwater{
    public static int trappedrainwater(int[] height){

        int n = height.length;
        //calculate left max value boundary - array
        int[] leftmax = new int[height.length];
        leftmax[0] = height[0];
        for(int i =1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate right max value boundary - array
        int[] rightmax = new int[height.length];
        rightmax[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        //loop
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            //Trapped water = waterlevel - height
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
 }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] height = new int[7];
        for (int i=0; i<height.length; i++){
            System.out.print("Enter your array value = ");
            height[i] = in.nextInt();
        }
        System.out.println(trappedrainwater(height));
    }
}
