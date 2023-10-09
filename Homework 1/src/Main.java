public class Main {
    public static void main(String[] args) {
        final int R = 5;

        for (int row = 1; row <= R; row++) {
            for (int i = 1; i <= 5; i++)
                System.out.print(i + " ");
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= R; row++) {
            for (int i = row; i <= row + 4; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}