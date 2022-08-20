import java.util.Scanner;

public class PraticeSet_Diamond_Pattern {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();


        int space = n-1;

        for (int i = 0; i < n; i++)
        {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space--;
        }


        space  = 0;
        for (int i = n; i > 0; i--)
        {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");

            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            space++;
        }


//
//        for (int line = 1; line<=n; line++) {
//            for (int space = n-line; space>0; space--){
//                System.out.print(" ");
//            }
//            for (int star = 1; star <= line; star++) {
//                System.out.print(no+" ");
//
//            }
//            no++;
//            System.out.println();
//        }



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
