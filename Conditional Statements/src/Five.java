import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = input.nextInt();
        int tax = 0;
        if(income>100 && income<500){
            System.out.println("your TAX is"+ tax);
        } else if (income>=500 && income<1000) {
            tax = tax+1000;
            System.out.println("your TAX is "+ tax);

        }else {
            System.out.println("Ghar pe jaa");
        }
    }
}
