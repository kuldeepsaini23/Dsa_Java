import java.util.Scanner;

public class CharacterPattern {

    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();
        char ch = 'A';

        for (int line = 1; line<=n; line++){
            for (int chars = 1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
