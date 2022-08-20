import java.util.Scanner;

public class Six {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Value of A");
        int a = input.nextInt();

        System.out.println("Eneter the value of B");
        int b = input.nextInt();

        System.out.println("Enter the Value of C");
        int c = input.nextInt();

        if (a > b) {
            if(a>c){
                System.out.println("A is largest");

            }else{
                System.out.println("C is Largest");
            }
        }else if(b>a){
            if(b>c){
                System.out.println("B is Largest");
            }else {
                System.out.println("C is largest");
            }

        }
    }

}
