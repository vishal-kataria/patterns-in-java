public class pattern9 {
    public static void main(String[] args) {
      /*
     *
    ***
   *****
  *******
 *********
 *********
  *******
   *****
    ***
     *

       */
        int star = 1;
        int space = 5;
        int starC=2;
        int spaceC=-1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            star+=starC;
            space+=spaceC;
            if(star > 9){
                starC = -2;
                spaceC = 1;
                star+=starC;
                space+=spaceC;
            }
            System.out.println();
        }
    }
}
