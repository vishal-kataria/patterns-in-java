public class pattern20 {
    public static void main(String[] args) {
        /*
         *                 *
         * *             * *
         * * *         * * *
         * * * *     * * * *
         * * * * * * * * * *
         * * * *     * * * *
         * * *         * * *
         * *             * *
         *                 *
         */
        int s= 2,sc =  2;
        int sp = 8,spc =-2;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s/2; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < s/2; j++) {
                System.out.print("* ");
            }
            if(s == 10){
                sc = -2;
                spc = 2;
            }
            s+=sc;
            sp+=spc;
            System.out.println();
        }
    }
}
