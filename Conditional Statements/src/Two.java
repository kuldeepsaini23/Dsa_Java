import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Value of A");
        int a = input.nextInt();

        System.out.println("Eneter the value of B");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("A is larger");
        }else{
            System.out.println("B is larger");
        }
    }

}
