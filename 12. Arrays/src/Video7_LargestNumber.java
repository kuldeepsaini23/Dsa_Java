public class Video7_LargestNumber {

    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
               largest = numbers[i];
            }

            if(smallest > numbers[i]){
               smallest = numbers[i];
            }
       }
        System.out.println("Smallest Value is: "+ smallest);
       return largest;

    }



    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("The Largest Number is: " + largestNumber(numbers));
    }
}
