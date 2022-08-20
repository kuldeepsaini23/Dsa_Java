import java.util.Scanner;

import static java.lang.Math.abs;

public class PracticeSet_PalindromePyramidPattern {

    public static void main(String[] args) {
       Scanner ns = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = ns.nextInt();



        int z = 1;
        for (int line = 1; line <= n; line++) {
            //Spaces
            for (int j = 1; j <= n-line; j++) {
                System.out.print(" ");
            }
        //First Part
            for (int star = line; star >= 1; star--) {
                System.out.print(star);

            }
            //second part
          for (int star = 2; star <= line ;star++) {
               System.out.print(star);

          }
                     System.out.println();
        }


//        Scanner ns = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int n = ns.nextInt();


//
//        int z = 1;
//        for (int line = 1; line <= n; line++) {
//
//            for (int j = n - 1; j >= line; j--) {
//                System.out.print(" ");           }
//            for (int star = i-1; star <= -(i-1); star--) {
//                System.out.print(i-abs(star));
//
//            }
//          z += 2;
//
//          System.out.println();
//      }
    }
}
