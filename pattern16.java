public class pattern16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
         */
        char w = 'A';
        for (int i = 1; i <=5  ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(w+" ");
            }
            System.out.println();
            w+=1;
        }
    }
}
