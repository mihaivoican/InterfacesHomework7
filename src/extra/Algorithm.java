package extra;

public class Algorithm {

    public static void main(String[] args) {
        int[] ints = {8, 7, 2, 5, 3, 1};
        printAllPairs(ints, 10);
        printAllTriplets(ints, 10);
    }
// Given an unsorted integer array, print all pairs with the given sum in it. Ex input: nums = [8, 7, 2, 5, 3, 1], target = 10. output = (8,2) and (7,3)
    public static void printAllPairs(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(String.format("%d + %d = %d", array[i], array[j], target));
                }
            }
        }
    }

    //Given an unsorted integer array, print triplets with the given sum in it.
    public static void printAllTriplets(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target) {
                        System.out.println(String.format("%d + %d + %d = %d", array[i], array[j], array[k], target));
                    }
                }
            }
        }
    }
}
