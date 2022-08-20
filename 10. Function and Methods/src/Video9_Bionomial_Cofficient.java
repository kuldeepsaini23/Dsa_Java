public class Video9_Bionomial_Cofficient {

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);//Recursion
        }
    }


    public static  int binCoeff(int n, int r){

        try{
            if(n<r){
            System.out.println("Error");
        }
        }catch (Exception e){
            System.out.println("Error is: " + e);
        }

            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n - r);

            int binCoeff = fact_n / (fact_r * fact_nmr);
            return binCoeff;



 }
    public static void main(String[] args) {

        System.out.println(binCoeff(7,5));


    }
}
