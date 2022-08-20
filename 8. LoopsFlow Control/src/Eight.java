public class Eight {
    public static void main(String[] args) {
        int n = 10899;

        for (int i = 0; i<5;i++){
           int num = n%10;
            System.out.print(num);
            n/=10;
        }

    }

}
