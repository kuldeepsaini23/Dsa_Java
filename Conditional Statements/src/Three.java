import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Value of n");
        int n = input.nextInt();



        if (n%2==0 ) {
            System.out.println("N is even");
        }else{
            System.out.println("N is not even");
        }
    }

}
