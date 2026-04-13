public class ArraySum {

    public int sum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int total = 0;
        for (int num : arr) {
            total += num;
        }

        return total;
    }
}