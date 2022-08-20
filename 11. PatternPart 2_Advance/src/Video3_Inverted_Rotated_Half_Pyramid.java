import java.util.Scanner;

public class Video3_Inverted_Rotated_Half_Pyramid {

    public static void inverted_Rotated_Half_Pyramid(int n){

        for(int i= 1; i<=n;i++){

            //space
            for(int j= 1; j<=n-i; j++){
               System.out.print(" ");
            }
            //star
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

        inverted_Rotated_Half_Pyramid(pattern);


    }
}
