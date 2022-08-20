public class Video7_SpiralMatrix {


    public static void spiralmatrix(int[][] arr){
        int sR = 0;//Starting Row
        int eR = arr.length-1;//Ending Column
        int sC = 0;//Starting Column
        int eC = arr[0].length-1;//Ending Column

        while(sR<=eR && sC<= eC){//i for rows and j for column
            //Top
            for (int j =sC; j<=eC; j++){
                System.out.print(arr[sR][j]+" ");
            }
            //Right
            for (int i =sR+1; i<=eR; i++){
                System.out.print(arr[i][eC]+" ");
            }
            //Bottom
            for (int j=eC-1; j>=sC; j--){
                if(sR==eR){
                    break;
                }
                System.out.print(arr[eR][j]+" ");
            }
            //Left
            for (int i =eR-1; i>=sR+1; i--){
                if(sC==eC){
                    break;
                }
                System.out.print(arr[i][sC]+" ");
            }
            sR++;
            eR--;
            sC++;
            eC--;
        }

    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        spiralmatrix(matrix);
    }
}
