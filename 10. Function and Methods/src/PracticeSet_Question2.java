import java.util.Scanner;

public class PracticeSet_Question2 {
    //Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method.

    public static boolean isEven(int n ){

        return n % 2 == 0;
    }
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = ns.nextInt();

        if(isEven(n)) {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd number");
        }

    }
}
