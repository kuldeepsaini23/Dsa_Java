import java.util.Scanner;

public class PraticeSet_Floyds_Triangle_Pattern {


    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();
        int no = 1;
        for (int line = 1; line<=n; line++){
            for (int number =1; number<=line; number++){
                System.out.print(no);
                no++;
            }
            System.out.println("");
        }
    }
}
