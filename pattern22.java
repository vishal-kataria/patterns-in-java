public class pattern22 {
    public static void main(String[] args) {
        int n=7;
// Create and print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0  ; j < n; j++) {
                System.out.print(Math.max(Math.abs(i - n / 2), Math.abs(j - n / 2)) + 1 + " ");
            }
            System.out.println();
        }

    }
}
