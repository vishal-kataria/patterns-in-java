public class pattern17 {
    public static void main(String[] args) {

        /*
            A
           ABA
          ABCBA
         ABCDCBA
        ABCDEDCBA
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i-1; j++) {
                System.out.print(" ");
            }
            char s = 'A';
            int br = (2*i+1)/2;
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print(s);
                if(j<=br){
                    s+=1;
                }else{
                    s-=1;
                }
            }
            System.out.println();
        }
    }
}
