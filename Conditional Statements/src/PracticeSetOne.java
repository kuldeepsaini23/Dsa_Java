import java.util.Scanner;

public class PracticeSetOne {


    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        int n = ns.nextInt();

        if(n>=0){
            System.out.println("No is Positive");
        }else {
            System.out.println("No is Negative");
        }
    }
}
