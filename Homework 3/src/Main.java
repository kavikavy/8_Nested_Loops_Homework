public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 7, 4};
        int k = 0;

        while (k < nums.length) {
            int l = 0;
            while (l < nums.length) {
                if (k != l) {
                    System.out.println(10 * nums[k] + nums[l]);
                }
                l++;
            }
            k++;
        }
    }
}