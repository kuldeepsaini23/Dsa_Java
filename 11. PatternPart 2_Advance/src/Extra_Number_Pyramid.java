import java.util.Scanner;

public class Extra_Number_Pyramid {

    public static void numberPyramid(int n){

        //Outer loop
        for(int i =1; i<=n;i++){

            //Spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

        numberPyramid(pattern);

    }
}
