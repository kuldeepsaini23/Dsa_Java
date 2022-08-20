import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = in.nextInt();

       String b = (a>33)? "He will pass" : "faillllll";
        System.out.println(b);

    }
}
