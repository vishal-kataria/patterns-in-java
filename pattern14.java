public class pattern14 {
    public static void main(String[] args) {
        /*
        A
        A B
        A B C
        A B C D
        A B C D E
         */
        char w = 'A';
        for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(w+" ");
                w+=1;
            }
            System.out.println();
            w='A';
        }
    }
}
