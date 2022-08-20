import java.util.Scanner;

public class Video5_Floyds_Triangle {

    public static void floyds_Triangle(int n){

        int no = 1 ;

        for (int i= 1; i<=n; i ++){

            for (int j=1 ; j<=i; j++){
                System.out.print(no+ " ");
                no++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();
        floyds_Triangle(pattern);

    }
}
