public class Main {
    public static void main(String[] args) {
        final int R = 6;
        for (int row = 1; row <= R; row++) {
            for (int i = row; i <= R; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row <= R; row++) {
            for (int i = row + 1; i <= (row * 2); i++) {
                System.out.print("*");
            }
            for (int i = row; i <= R - 1; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}