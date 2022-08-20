public class Video18BinToDec {
    public static void binToDec(int binNUm){
        int mynum = binNUm;//because binary no is going to change after the loop
        int pow =0;
        int dec = 0;

        while(binNUm>0){
            int lastDigit = binNUm%10;
            dec =  dec + (int)(lastDigit*Math.pow(2,pow));
            pow++;
            binNUm = binNUm/10;
        }
        System.out.println("Decimal Number of "+ mynum +" is: "+ dec);
    }
    public static void main(String[] args) {

        binToDec(111);

    }
}
