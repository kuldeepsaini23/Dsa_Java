public class Video4_PassingAnArgument {

    public static void update(int marks[]){

        for(int i=0; i<marks.length;i++){
            marks[i]+=1;
        }

    }

    public static void main(String[] args) {

        int marks[] = {90, 20, 70};
        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        update(marks);

        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }


    }
}
