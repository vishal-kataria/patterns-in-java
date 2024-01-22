public class pattern10 {
    public static void main(String[] args) {
        int star = 1;
        int space = 1;
        int starC = 1;
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            star+=starC;
            if(star > 5){
                starC=-1;
                star+=starC*2;
            }
            System.out.println();
        }
    }
}
