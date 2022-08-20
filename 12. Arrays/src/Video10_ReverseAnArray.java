public class Video10_ReverseAnArray {

    public static void reverse(int numbers[]){

        int first=0, last=numbers.length-1;

        while(first<last){
            //Swap

            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void print(int numbers[]){

       for (int i = 0; i< numbers.length;i++){
           System.out.print(numbers[i]+" ");
       }
        System.out.println();
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 10, 12, 14, 16};

        reverse(numbers);
        print(numbers);

    }
}

///By copying or temp arr
//    static void reverse(int a[], int n)
//    {
//        int b[] = new int[n];
//        int j = n;
//        for (int i = 0; i < n; i++) {
//            b[j - 1] = a[i];
//            j --;
//        }

//    public static void main(String[] args)
//    {
//        int [] arr = {10, 20, 30, 40, 50};
//        reverse(arr, arr.length);
//    }