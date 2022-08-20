import java.util.Scanner;

public class fourteen {

    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        do{
            System.out.println("Enter you no");
            int n = ns.nextInt();;
            if(n%10==0)
                continue;
            System.out.println(n);
        }while(true);
    }
}
