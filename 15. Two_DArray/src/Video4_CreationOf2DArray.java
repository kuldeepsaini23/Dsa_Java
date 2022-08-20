import java.util.Scanner;

public class Video4_CreationOf2DArray {

    public static void print(int[][] arr){

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int[][] arr, int key){

        for (int i=0; i<arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("your Key is at place: ("+i+","+ j+")");
                    return true;
                }
            }
            System.out.println();
        }
        System.out.println("Key is not Present in Array");
        return false;
    }

    public static  void largestAndSmallest(int[][] arr){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] > largest) {
                    largest = ints[j];
                }

                if (ints[j] < smallest) {
                    smallest = ints[j];
                }
            }

        }
        System.out.println("Your smallest and Largest Number are = " + smallest + ", "+ largest);
    }

    public static void main(String[] args) {
        int [][] matrix = new int[3][3];

        Scanner input = new Scanner(System.in);

        for (int i=0; i<matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){

                matrix[i][j] = input.nextInt();
            }
        }

        print(matrix);
        int key = 10;
        search(matrix,key);
        largestAndSmallest(matrix);
    }
}
