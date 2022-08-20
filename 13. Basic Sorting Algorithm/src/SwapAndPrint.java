public class SwapAndPrint {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
    }

    public static void print(int numbers[]){

        for (int i = 0; i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[ ] num = {1,2,3};
        print(num);
        if(num[1]> num[0]){
            int tem = num[0];
            num[0] = num[1];
            num[1] = tem;
        }

    }
}
