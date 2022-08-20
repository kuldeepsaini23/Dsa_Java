import java.util.Scanner;

public class Practice_Set_NUMBER_PYRAMID_Pattern {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();

        int no = 1;

        for (int line = 1; line<=n; line++) {
            for (int space = n-line; space>0; space--){
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print(no+" ");

            }
            no++;
            System.out.println();
        }

//        for (int line = n; line>=1; line--) {
//            for (int space = 0; space<n-line; space++){
//                System.out.print(" ");
//            }
//            for (int star = 1; star <= line; star++) {
//                System.out.print(no+" ");
//
//            }
//            no++;
//            System.out.println();
//        }
    }
}
