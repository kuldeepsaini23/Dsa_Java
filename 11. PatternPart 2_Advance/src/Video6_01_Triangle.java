import java.util.Scanner;

public class Video6_01_Triangle {



        public static void zeroOneTriangle(int n){



            for (int i= 1; i<=n; i ++){

                for (int j=1 ; j<=i; j++){
                    if(j%2==0){
                        System.out.print("0 ");
                    }else{
                        System.out.print("1 ");
                    }
                }

                System.out.println();
            }
        }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter The number: ");
        int pattern = in.nextInt();
        zeroOneTriangle(pattern);

    }
}
