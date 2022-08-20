import java.sql.SQLOutput;
import java.util.Scanner;

public class HalfPyramid {

    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();

        for (int line = 1; line<=n; line++){
            for (int number =1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println("");
        }
    }
}
