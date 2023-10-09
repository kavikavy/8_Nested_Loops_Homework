public class Main {
    public static void main(String[] args) {
        int[] a = {4, 4, 6, 11, -2, 3};
        int[] b = {5, 11, 11, -3, 3, 5};
        System.out.println(symDiff(a, b));
    }

    static int[] symDiff (int[] a, int[] b) {
        int[] symDiff = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[j] != b[i]) {
                    symDiff[j] = a[j];
                }
            }
        }
        return symDiff;
    }
}