public class Video10_CountingSort {

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
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;//index
                count[i]--;//frequency from count array
            }

        }

    }
    public static void print(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {5, 4, 3, 2, 1};

        countingSort(numbers);
        print(numbers);
    }
}
