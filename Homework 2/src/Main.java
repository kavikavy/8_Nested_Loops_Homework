public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};

        for (int n = 0; n < a.length; n++) {
            for (int m = 0; m < b.length; m++) {
                if (a[n] == b[m]) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}