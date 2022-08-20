public class Video14_PrimeorNot {

    public static boolean isPrime(int n){
        if(n==2) {
            return true;
        }else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
          return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));

    }
}
