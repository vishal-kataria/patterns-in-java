public class pattern11 {
    public static void main(String[] args) {
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        0 1 0 1 0 1
         */
        int e = 1;
        int o = 0;

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                if(i%2 ==0){
                    System.out.print(e+" ");
                    e = e == 1 ? 0 :1;
                }else{
                    System.out.print(o+" ");
                    o = o == 1 ? 0 :1;
                }

            }
            System.out.println();
            e = 1;
            o = 0;
        }
    }
}
