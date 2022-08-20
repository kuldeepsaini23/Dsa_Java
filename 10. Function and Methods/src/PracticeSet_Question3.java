import java.util.Scanner;

public class PracticeSet_Question3 {
   //Write a Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a
    // palindrome because the reverse of 121 is 121 itself. On the other hand,321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

    public static boolean checkIsPalindrome(int num){
        int myNum = num;
        int rev = 0;

        while (num > 0) {
            int lastDigit = num%10;
            rev = rev*10 + lastDigit;
            num/=10;
        }

        return rev==myNum;

    }
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your Number");
        int n = ns.nextInt();

        if(checkIsPalindrome(n)) {
            System.out.println("Your number is Palindrome");
        }
        else{
            System.out.println("errrrrrrroorrrrrrrr");
        }

    }
}
