import java.util.Scanner;

public class Ten {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Operator");

        int i = 0;
        char operator = in.next().charAt(i);
        switch(operator) {
            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

        }




    }
}
