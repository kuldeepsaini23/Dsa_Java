import java.util.Scanner;
//Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} };Output - 2

public class PracticeSet_Question1 {

    public static int numberOfElement(int[][] arr, int number){
        int count = 0;
        for (int i =0; i< arr.length;i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if(arr[i][j] == number){
                   count++;
               }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[][] array = { {4,7,8}, {8,8,7} };

        Scanner ns = new Scanner(System.in);

        System.out.print("Enter your number = ");
        int number = ns.nextInt();
        System.out.println(numberOfElement(array,number));
    }
}
