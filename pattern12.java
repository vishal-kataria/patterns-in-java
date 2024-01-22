public class pattern12 {
    public static void main(String[] args) {
        /*
        1      1
        12    21
        123  321
        12344321
         */

        int n = 1;
        int s = 6;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > 0 ; j--) {
                System.out.print(j);
            }
            n+=1;
            s-=2;
            System.out.println();
        }

    }
}
