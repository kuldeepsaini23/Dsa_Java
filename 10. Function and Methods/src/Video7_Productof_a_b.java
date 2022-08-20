import java.util.Scanner;

public class Video7_Productof_a_b {
    public static int product(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = ns.nextInt();

        System.out.print("Enter the value of b ");
        int b = ns.nextInt();

        int prod = product(a,b);
        System.out.println(prod);
    }
}
