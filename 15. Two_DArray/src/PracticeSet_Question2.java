public class PracticeSet_Question2 {

    public static void sumOfElement(int[][] arr, int rowIndex){
        int sum = 0;
         for (int j = 0; j < arr[0].length; j++) {
                  sum+= arr[rowIndex][j];
         }
        System.out.println(sum);
   }

    public static void main(String[] args) {
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        int row = 1;
        sumOfElement(nums,row);
    }
}
