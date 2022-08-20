public class video15_MaxSubarray_KadenesAlgo {

    public static void kadanes(int numbers[]) {//Kadane's algorithm

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        //if the no is negative or positive
        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < numbers[i]) {
                cs = numbers[i];
            }
            if (ms < cs) {
                ms = cs;
            }
        }
        System.out.println("our max Sub array Sum is = " + ms);
    }

        //For Positive number
//        for(int i=0; i< numbers.length; i++){
//            cs = cs + numbers[i];
//            if(cs < 0){
//                cs=0;
//            }
//            ms = Math.max(ms,cs);
//        }
//        System.out.println("our max Sub array Sum is = "+ ms);
//    }

    public static void main(String[] args) {
        int numbers[] = {-2, -4};
        kadanes(numbers);
    }
}
