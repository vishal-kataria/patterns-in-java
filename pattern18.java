public class pattern18 {
    public static void main(String[] args) {
        /*
        E
        D E
        C D E
        B C D E
        A B C D E
         */
        char a = 'E';
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j > 0; j--) {
                System.out.print((char)(a-j+1)+" ");
            }
            System.out.println();
        }
    }
}
