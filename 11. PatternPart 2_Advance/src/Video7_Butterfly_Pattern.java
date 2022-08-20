import java.util.Scanner;

public class Video7_Butterfly_Pattern {

    public static void butterflyPattern(int n){

        for (int i= 1; i<=n; i++){
            int space = 2*(n-i);

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
             //Reverse
        for (int i= n; i>=1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

        butterflyPattern(pattern);
    }
}
