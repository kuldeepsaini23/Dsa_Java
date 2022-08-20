import java.util.Scanner;

public class PracticeSet_Question5 {

    //Write a Java method to compute the sum of the digits in an integer.

//
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = ns.nextInt();

        System.out.println("Your sum of digits is " + sumOfDigits(n));
    }

    public static int sumOfDigits(int number){
        int sum = 0;

        while (number > 0) {
            int lastDigit = number%10;
            sum = sum + lastDigit;
            number/=10;
        }

        return sum;

    }

}
