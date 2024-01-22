public class pattern19 {
    public static void main(String[] args) {
        int star = 10;
        int space = 0;
        int ss= 2;
        int sc = -2;

        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j < star/2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star/2; j++) {
                System.out.print("*");
            }
            star+=sc;
            space+=ss;
            if(star<=1){
                sc = 2;
                ss = -2;
                star += sc;
                space += ss;
            }
            System.out.println();
        }

    }
}
