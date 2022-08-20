import java.util.Scanner;

public class PracticeSet_Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner ns = new Scanner(System.in);
        System.out.println("Enter your rows");
        int rows = ns.nextInt();

        System.out.println("Enter your Columns");
        int columns = ns.nextInt();
////////////Rectangle
        for(int i= 1; i<=rows;i++){
            for(int j =1; j<=columns; j++){
                if(i==1 || i==rows || j ==1 || j==columns){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


////////////////////Square////////////
         for(int i= 1; i<=rows;i++){
            for(int j =1; j<=rows; j++){
                if(i==1 || i==rows || j ==1 || j==rows){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
