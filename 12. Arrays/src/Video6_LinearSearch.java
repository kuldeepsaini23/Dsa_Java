public class Video6_LinearSearch {

    public static int linearSearch(int numbers[], int key){

        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String numbers[], String key){

        for (int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 10, 12, 14, 16};
        int key = 10;
        int index =  linearSearch(numbers, key);

        if(index==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("The index is: "+ index);
        }

        String menu[] = {"kul", "null", "jal"};
        String key2 = "kul";

        int index1 =  linearSearch(menu, key2);
        if(index1==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("The index is: "+ index1);
        }


    }
}
