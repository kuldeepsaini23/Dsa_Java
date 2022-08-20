import java.util.Scanner;

public class Video4_Inverted__Half_Pyramid_with_Number {
    public static void inverted__Half_Pyramid_with_Number(int n){

        for (int i= 1; i<=n; i ++){

            for (int j=1 ; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

        inverted__Half_Pyramid_with_Number(pattern);
    }
}
