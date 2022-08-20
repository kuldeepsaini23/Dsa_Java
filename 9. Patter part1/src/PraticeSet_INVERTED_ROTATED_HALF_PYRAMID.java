import java.util.Scanner;

public class PraticeSet_INVERTED_ROTATED_HALF_PYRAMID {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();

        for (int line = 1; line<=n; line++) {
            for (int space = n-line; space>0; space--){
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
 }
}
