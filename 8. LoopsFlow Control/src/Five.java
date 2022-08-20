import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = input.nextInt() ;
        int i =1;
        int sum = 0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
