import java.util.Scanner;

public class Video9_Hollow_Rhombus {
        public static void hollowRhomus(int n){

            for (int i =1; i<=n; i++){

                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++){
                    if(i==1 || i==n || j==1 || j==n) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
            System.out.print("Enter The number: ");
            int pattern = in.nextInt();

            hollowRhomus(pattern);

        }


}
