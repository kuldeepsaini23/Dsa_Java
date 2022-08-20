public class Video20_DecToBin {

    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum>0){
            int reminder = decNum%2 ;
            binNum = binNum + (reminder*(int)Math.pow(10,pow));
            pow++;
            decNum/=2;

        }
        System.out.println("The Binary Number of "+myNum+" is: "+binNum);
    }
    public static void main(String[] args) {

        decToBin(7);
    }
}
