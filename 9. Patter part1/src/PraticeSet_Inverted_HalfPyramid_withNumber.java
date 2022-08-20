import java.util.Scanner;

public class PraticeSet_Inverted_HalfPyramid_withNumber {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();

        for (int line = 1; line<=n; line++){
            for (int number =1; number<=n-line+1; number++){
                System.out.print(number);

            }
            System.out.println("");
        }

        /*oooorrrrr

         for (int line = n; line>=1; line--){
            for (int number =n; number>=line; number--){
                System.out.print(number);

            }
            System.out.println("");
        }
         */


    }
}
