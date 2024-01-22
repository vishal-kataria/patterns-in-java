public class pattern21 {
    public static void main(String[] args) {

        int star = 4,sc = -2;
        int space = 0,spc = 2;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < star/2; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < star/2; j++) {
                System.out.print("* ");
            }
            star +=sc;
            space+=spc;
            System.out.println();
            if(star == 0){
                sc = 2;
                spc = -2;
                star+=sc;
                space+=spc;
            }
        }
    }
}
