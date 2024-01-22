public class pattern15 {
    public static void main(String[] args) {
        /*
        A B C D E
        A B C D
        A B C
        A B
        A
         */
        char w = 'A';
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(w+" ");
                w+=1;
            }
            System.out.println();
            w='A';
        }
    }
}
