public class Video13_MaxSubarraySum {
    public static void maxSubarraySum(int numbers[]){

        int maximumSum = Integer.MIN_VALUE;
        int currSum = 0;


        for(int i=0; i<numbers.length;i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end =j;

                currSum = 0;
                for(int k=start; k<=end;k++){//Subarray
                    System.out.println(numbers[k]+ " ");
                    currSum += numbers[k];
                }

                System.out.println("The Subarray Sum is = " + currSum);
                if(maximumSum < currSum){
                    maximumSum = currSum;
                }
            }
        }
        System.out.println("max Sum = " + maximumSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarraySum(numbers);
    }
}
