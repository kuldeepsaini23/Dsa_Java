import java.util.Scanner;

public class PraticeSetThree {
    public static void main(String[] args) {
        Scanner ns  = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = ns.nextInt();

        int fact = 1;
        for (int i = 1; i<=n; i++ ){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
