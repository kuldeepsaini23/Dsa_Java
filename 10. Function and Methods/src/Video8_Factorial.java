import java.util.Scanner;

public class Video8_Factorial {
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }else{
            return n*factorial(n-1);//Recursion
        }
        }



    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.print("Enter the value of a ");
        int a = ns.nextInt();

        int product = factorial(a);
        System.out.println(product);
    }
}
