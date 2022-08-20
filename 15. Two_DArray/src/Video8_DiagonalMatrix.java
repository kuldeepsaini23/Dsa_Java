public class Video8_DiagonalMatrix {

//               Brute Force method
/*  public static int diagonalMatrixSum(int[][] arr){

        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                    sum+= arr[i][j];
                } else if (i+j == arr.length-1) {
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    }*/

    //      Optimizes Approach
    public static int diagonalMatrixSum(int[][] arr){
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
           //pd
            sum+= arr[i][i];
            //sd
            if(i != arr.length-1-i) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        System.out.println("The Sum of Diagonals are = "+ diagonalMatrixSum(matrix));
    }
}
