public class PracticeSet_Question3 {
//transpose of a Matrix
    public static void transpose(int arr[][], int row, int column){

        int[][] transpose =  new int[row][column];
        for (int i=0; i<arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                transpose[j][i] = arr[i][j];
                }
            }
            print(transpose);
        }




    public static void print(int[][] arr){

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        print(nums);
        System.out.println();

        transpose(nums, nums.length, nums[0].length);



    }
}

