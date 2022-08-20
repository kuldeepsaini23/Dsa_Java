import java.util.Scanner;

public class PraticeSet_01_Triangle {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();

        for (int line = 1; line<=n; line++){

            for (int number =1; number<=line; number++){

               if(number%2==0){
                   System.out.print("0");
               }else{
                   System.out.print("1");
               }


            }

            System.out.println("");
        }
    }
}
