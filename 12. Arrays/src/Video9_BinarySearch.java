public class Video9_BinarySearch {

    public static int binarySearch(int number[], int key ){
        int start = 0;
        int end = number.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            //Comparison
            if(number[mid] ==key){
                return mid;
            }

            if(number[mid] > key){//Left
                end = mid-1;

            }else{//Right
                start = mid+1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 10, 12, 14, 16};
        int key = 16;

        System.out.println("the Index for key is: " + binarySearch(numbers,key));

    }
}
