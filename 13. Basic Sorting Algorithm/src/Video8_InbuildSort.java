import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Video8_InbuildSort {

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};

        Arrays.sort(numbers,0,2);
        print(numbers);

        Arrays.sort(numbers);
        print(numbers);

        //Descending Order
        Integer[] numbers2 = {1, 4, 3, 2, 5};
        Arrays.sort(numbers2,2,5, Collections.reverseOrder());
        print(numbers2);

        Arrays.sort(numbers2, Collections.reverseOrder());
        print(numbers2);
    }
}
