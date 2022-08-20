import java.util.Scanner;

public class Swap_and_Print {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
    }

    public static void print(int numbers[]){

        for (int i = 0; i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array input

        int[] height = new int[7];
        for (int i=0; i<height.length; i++){
            System.out.print("Enter your array value = ");
            height[i] = in.nextInt();
        }
    }
}
