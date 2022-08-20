public class Video7_InsertionSort {

    public static void insertionSort(int arr[]){

           for(int i = 1; i <arr.length;i++) {
               int curr = arr[i];//unsorted
               int prev = i-1;//Sorted
               while(prev>=0 && arr[prev]>curr){
                   arr[prev+1]  = arr[prev];
                   prev--;
               }
               //Insertion
               arr[prev+1] = curr;
           }
    }

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {5, 4, 3, 2, 1};

        insertionSort(numbers);
        print(numbers);

    }
}
