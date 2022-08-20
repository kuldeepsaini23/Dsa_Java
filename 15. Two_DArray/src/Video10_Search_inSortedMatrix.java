public class Video10_Search_inSortedMatrix {
    //This is thg optimized approach for Sorted array
//    public static boolean search(int[][] arr, int key){//starting from '4'
//
//        int row = 0;
//        int column = arr[0].length-1;
//        while (row< arr.length && column>=0){
//            if(arr[row][column]== key){
//                System.out.println("("+row+", "+column+")");
//                return true;
//            }else if (arr[row][column] > key){
//                column--;
//            }else {
//                row++;
//            }
//        }
//        System.out.println("Key does not Found");
//        return false;
//    }

    public static boolean search(int[][] arr, int key){//starting from '13'

        int row = arr.length-1;
        int column = 0;
        while (row>=0  && column<arr[0].length){
            if(arr[row][column]== key){
                System.out.println("("+row+", "+column+")");
                return true;
            }else if (arr[row][column] > key){
                row--;
            }else {
                column++;
            }
        }
        System.out.println("Key does not Found");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int key = 9;
        search(matrix,key);
    }
}
