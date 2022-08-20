import java.util.Scanner;

public class Video8_Solid_Rhombus {

    public static void solidRhomus(int n){

        for (int i =1; i<=n; i++){

            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

        solidRhomus(pattern);

    }
}
