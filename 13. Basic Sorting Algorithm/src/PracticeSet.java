public class PracticeSet {

    public static void bubbleSort(int[] arr){
        for(int i= 0 ;i <arr.length-1; i++){//turns
            for (int j= 0; j<arr.length-1-i; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void selectionSort(int[] arr){
        for(int i= 0 ;i <arr.length-1; i++){//turns
            int minposi = i;
            for (int j= i+1; j<arr.length; j++){
                if(arr[minposi] < arr[j] ){
                    minposi = j;
                }
            }
            int temp = arr[minposi];
            arr[minposi] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionSort(int arr[]){

        for(int i = 1; i <arr.length;i++) {
            int curr = arr[i];//unsorted
            int prev = i-1;//Sorted
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1]  = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev+1] = curr;
        }
    }

    public static void print(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i= 0; i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        //Count
        int[] count = new int[largest+1];
        for (int i =0; i<arr.length;i++){
            count[arr[i]]++;
        }

        //Sorting
        int j= 0 ;
        for(int i=count.length-1; i>=0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;//index
                count[i]--;//frequency from count array
            }

        }

    }

    public static void main(String[] args) {
        int numbers[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(numbers);
        print(numbers);

        selectionSort(numbers);
        print(numbers);

        insertionSort(numbers);
        print(numbers);

        countingSort(numbers);
        print(numbers);
    }
}
