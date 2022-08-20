import java.util.Scanner;

public class Extra_Palindromic_Pattern {

    public static void palindromicPattern(int n){

        //Outer loop
        for(int i =1; i<=n;i++){

            //Spaces
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j = i; j>=1; j--){
                System.out.print(j);
            }

            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();

       palindromicPattern(pattern);

    }
}
