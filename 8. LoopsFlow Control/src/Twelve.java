import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        do{
            System.out.println("Enter you no");
            int n = ns.nextInt();;
            if(n%10==0)
                break;
            System.out.println(n);
        }while(true);
    }
}
