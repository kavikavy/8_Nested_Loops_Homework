public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3};
        System.out.println(uniques(numbers));
    }

    static boolean uniques(int[] numbers) {
        boolean isUnique = true;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    isUnique = false;
                    break;
                }
            }
        }

        return isUnique;
    }
}