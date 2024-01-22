public class pattern8 {
    public static void main(String[] args) {
        /*
        *********
         *******
          *****
           ***
            *
        */
        int space = 0;
        int star = 9;
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star -=2;
            space +=1;
            System.out.println();
        }
    }
}
