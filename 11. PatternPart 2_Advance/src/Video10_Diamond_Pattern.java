import java.util.Scanner;

public class Video10_Diamond_Pattern {
    public static void diamond_Pattern(int n){

        for (int i= 1; i<=n; i++){
            int star = (2*i)-1;
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=star; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //Reverse

        for (int i= n; i>=1; i--){
            int star = (2*i)-1;
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=star; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

        diamond_Pattern(pattern);

    }
}
