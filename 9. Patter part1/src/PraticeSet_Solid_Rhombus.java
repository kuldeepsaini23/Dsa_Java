import java.util.Scanner;

public class PraticeSet_Solid_Rhombus {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int rows = ns.nextInt();
        int i, j;
        for (i=1; i<=rows; i++) {
            // Print trailing spaces
            for (j = 1; j <= rows - i; j++)
                System.out.print(" ");

            // Print stars after spaces
            for (j = 1; j <= rows; j++)
                System.out.print("*");

            // Move to the next line/row
            System.out.println();
        }

        }

}
