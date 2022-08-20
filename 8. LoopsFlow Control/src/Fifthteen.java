import java.util.Scanner;
/**This is the code for finding prime number**/
//public class Fifthteen {
//    public static void main(String[] args) {
//        Scanner ns  = new Scanner(System.in);
//        System.out.println("Enter the Number");
//        int n = ns.nextInt();
//
//        if( n==2 ){
//            System.out.println("Number is  prime");
//        } else if ( n==1 ) {
//            System.out.println("Number is  prime");
//        } else if ( n==0 ) {
//            System.out.println("Number is  prime");
//        }else{
//            boolean isPrime= true;
//            for (int i = 2; i<=n-1; i++){
//               if(n%i==0) {
//                   isPrime = false;
//               }
//            }
//            System.out.println("N i not prime");
//        }
//    }
//}



//This is the Optimize code for finding Prime number
public class Fifthteen {
    public static void main(String[] args) {
        Scanner ns  = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = ns.nextInt();

        if( n==2 ){
            System.out.println("Number is  prime");
        } else if ( n==1 ) {
            System.out.println("Number is  prime");
        } else if ( n==0 ) {
            System.out.println("Number is  prime");
        }else{
            boolean isPrime= true;
            for (int i = 2; i<=Math.sqrt(n); i++){//underroot n is used
                if(n%i==0) {
                    isPrime = false;
                }
            }
            System.out.println("N i not prime");
        }
    }
}