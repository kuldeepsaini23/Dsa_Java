public class Video5_SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i= 0 ;i <arr.length-1; i++){//turns
            int minposi = i;
            for (int j= i+1; j<arr.length; j++){
                if(arr[minposi] > arr[j] ){
                    minposi = j;
                }
            }
            int temp = arr[minposi];
            arr[minposi] = arr[i];
            arr[i] = temp;
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

        selectionSort(numbers);
        print(numbers);
    }

}

